package com.ercan.gradle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumRunner {
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        return driver;
    }
    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/git-up/GitUp");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Selenium");
        Actions action= new Actions(driver);
        action.sendKeys(Keys.ENTER);
        driver.quit();
    }
}
