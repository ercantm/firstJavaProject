package com.ercan.gradle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

    public static  WebDriver driver;
@Before
public void setup(){
     driver= SeleniumRunner.getDriver();

    driver.manage().window().maximize();
}
@After
public void tear(){
    driver.quit();
}
    @Test
    public void testusa(){


        driver.get("https://github.com/git-up/GitUp");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Selenium");
        Actions action= new Actions(driver);
        action.sendKeys(Keys.ENTER);

    }
}
