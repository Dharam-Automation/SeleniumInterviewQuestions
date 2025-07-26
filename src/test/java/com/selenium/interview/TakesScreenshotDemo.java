package com.selenium.interview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakesScreenshotDemo {
	
	public static void main(String args[]) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup(); // in place of System.seProprty("", "");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		TakesScreenshot screen =  ((TakesScreenshot)driver);
		File scrFile = screen.getScreenshotAs(OutputType.FILE);
		
		String fileName = "screenshot";
		FileUtils.copyFile(scrFile, new File("C:/Users/Dharam/eclipse-workspace25/InterviewQuestion/Downloads" + fileName+".jpg"));
		
		driver.close();
		
		//upload a file in selenium ----------
		// changes in main
		
		//driver.findElement(By.id("input element")).sendKeys("path".jpg);
		
		

	}
	

}
