package com.vi.selenium.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author VI
 */
public class TestCase3 {

    /*
    Steps to Automate:
1. Launch browser of your choice say., firefox, chrome etc.
2. Open this URL -  www.amazon.in
3. Maximize or set size of browser window.
4. Get the page title and print it.
5. Click on first menu link, say 'Amazon Pay'.
6. Get Page title and verify it with expected value.
7. Navigate back to Home Page. 
8. Get Page title and verify it with expected value.
9. Repeat steps 5 to 8 for other menu links.
10. Close the browser.
     */
    public static void main(String[] args) {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //Get the page title and print it.
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Click on first menu link, say 'Amazon Pay'.
        driver.findElement(By.linkText("Amazon Pay")).click();
        //Get Page title and verify it with expected value.
        String pageAmazonPay = driver.getTitle();
        System.out.println(pageAmazonPay);
        if ("Amazon Pay".equals(pageAmazonPay)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        //Navigate back to Home Page. 
        driver.navigate().to("https://www.amazon.in/");
        //Get Page title and verify it with expected value.
        System.out.println(pageTitle);
        if ("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in".equals(pageTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        //Repeat steps 5 to 8 for other menu links.
        driver.findElement(By.linkText("Fashion")).click();
        String pageFashion = driver.getTitle();
        System.out.println(pageFashion);
        if ("Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids".equals(pageFashion)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.quit();
    }
}
