package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelaunch {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\testing\\GitHub\\CurrentWorkSpace\\TestAutomation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashokmachani303@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Meena@303");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.className("desktop-suggestion null")).submit();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Srcfile,new File("D:\\testing\\GitHub\\CurrentWorkSpace\\TestAutomation\\Web-Automation\\Library\\ImagesScreenshot\\image1.png"));
		//driver.close();
	}

}
