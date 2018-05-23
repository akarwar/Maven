package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenExample {
	WebDriver driver;
	@Test
	public void maveTest() {
		
		System.setProperty("phantomjs.binary.path","C:\\Users\\ahsan\\Documents\\Drivers\\Phontom JS\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver=new PhantomJSDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
	
		
	}

}
