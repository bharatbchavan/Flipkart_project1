package Utilites;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_logic implements ITestListener{
public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		//upcasting takesscreenshot interface
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//get screenshot using getscreeenshotas method
		File f1=ts.getScreenshotAs(OutputType.FILE);
		
		//storing the screenshot using File class
		File f2= new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Flipkart_project\\Screenshot_Folder\\PASS_TC\\passesTc"+Math.random()+".png");
		
		//copy the screenshot filehandler class
		try {
			org.openqa.selenium.io.FileHandler.copy(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		//upcasting takesscreenshot interface
				TakesScreenshot ts=(TakesScreenshot) driver;
				
				//get screenshot using getscreeenshotas method
				File f1=ts.getScreenshotAs(OutputType.FILE);
				
				//storing the screenshot using File class
				File f2= new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Flipkart_project\\Screenshot_Folder\\FAILD_TC\\failedTC"+Math.random()+".png");
				
				//copy the screenshot filehandler class
				try {
					org.openqa.selenium.io.FileHandler.copy(f1, f2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
	}

	
}
