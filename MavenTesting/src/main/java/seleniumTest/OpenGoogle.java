package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
TakesScreenshot screenshot = (TakesScreenshot) driver;
File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
File destinationFile = new File("D:\\sample1.png");
FileHandler.copy(sourceFile,destinationFile);

	}

}
