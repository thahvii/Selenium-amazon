/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vi.selenium.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author VI
 */
public class TestCase2 {

    /*
    Steps to Automate:
1. Launch browser of your choice say., firefox, chrome etc.
2. Open this URL -  https://www.techlistic.com/
3. Maximize or set size of browser window.
4. Click on 'Java Tutorial' link and validate page title.
5. Navigate back to Home Page.
6. Click on 'Selenium Tutorial' link and validate page title.
7. Navigate back to Home Page.
8. Click on 'Selenium Blogs' link and validate page title.
9. Navigate back to Home Page.
10. Click on 'TestNG Blogs' link and validate page title.
11. Close the browser.
     */
    public static void main(String[] args) {
        //Launch browser of your choice say., firefox, chrome etc.
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        //Open this URL -  https://www.techlistic.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/");
        //Maximize or set size of browser window.
        driver.manage().window().maximize();
        //Click on 'Java Tutorial' link and validate page title.
        driver.findElement(By.linkText("Java")).click();
        String pageJavaTutorial = driver.getTitle();
        System.out.println(pageJavaTutorial);
        if ("Java Tutorial For Beginners - Techlistic".equals(pageJavaTutorial)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        //Navigate back to Home Page.
        driver.navigate().to("https://www.techlistic.com/");

        //Click on 'Selenium Tutorial' link and validate page title.
        driver.findElement(By.linkText("SELENIUM")).click();
        String pageSeleniumTutorial = driver.getTitle();
        System.out.println(pageSeleniumTutorial);
        if ("Selenium Webdriver Tutorial - Techlistic".equals(pageSeleniumTutorial)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        //Navigate back to Home Page.
        driver.navigate().to("https://www.techlistic.com/");

        //Click on 'Selenium Blogs' link and validate page title.
        driver.findElement(By.linkText("BLOGS")).click();
        String pageSeleniumBlogs = driver.getTitle();
        System.out.println(pageSeleniumBlogs);
        if ("Techlistic".equals(pageSeleniumBlogs)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        //Navigate back to Home Page.
        driver.navigate().to("https://www.techlistic.com/");

        //Click on 'TestNG Blogs' link and validate page title.
        driver.findElement(By.linkText("TESTNG")).click();
        String pageTestNGBlogs = driver.getTitle();
        System.out.println(pageTestNGBlogs);
        if ("Selenium-TestNG Framework Tutorial".equals(pageTestNGBlogs)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        //Navigate back to Home Page.
        driver.navigate().to("https://www.techlistic.com/");
        driver.quit();
    }
}
