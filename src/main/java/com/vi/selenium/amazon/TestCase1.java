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
public class TestCase1 {

    /*
    Steps to Automate:
1. Launch browser of your choice say., firefox, chrome etc.
2. Open this URL -  www.amazon.in
3. Maximize or set size of browser window.
4. Get the page title and print it.
5. Now, click on first menu link say 'Amazon Pay' (or choose any other link from the menu list)
6. Get the page title and print it.
7. Navigate back to Home Page.
8. Get the page title and print it. Verify that value matches with output of point no. 4
9. Close the browser.
     */
    public static void main(String[] args) {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        
        

        driver.manage().window().maximize();
//       Dimension d = new Dimension(1000, 1500);
//       driver.manage().window().setSize(d);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.linkText("Amazon Pay")).click();
        driver.navigate().to("https://www.amazon.in");

        driver.quit();
    }
}
