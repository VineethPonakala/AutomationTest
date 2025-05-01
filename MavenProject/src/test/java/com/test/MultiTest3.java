package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;

public class MultiTest3 {

    WebDriver driver;

    @BeforeClass
    public void Initialization()
    {
        driver = new ChromeDriver(); // RTP

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println("Hello");
    }


    @Test

    public void Test1() {

        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

        Actions act = new Actions(driver);

        act.moveToElement(accountList).perform();

        List<WebElement> li = driver.findElements(By.xpath("//div[@id='nav-al-container']//a"));

        System.out.println(li.size());

        for (int i = 0; i < li.size(); i++) {
            String text = li.get(i).getText();
            System.out.println(text);

        }


    }


    @Test

    public void Test2()
    {

        WebElement alldropdown = driver.findElement(By.id("searchDropdownBox"));

        Select sel = new Select(alldropdown);

        List<WebElement> li = sel.getOptions();

        System.out.println(li.size());

        for (int i = 0; i < li.size(); i++) {

            li.get(i).click();

            System.out.println(li.get(i).getText());
        }

    }
    @AfterClass
    public void cleanup()
    {
        driver.quit();
    }
}


