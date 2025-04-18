package com.nimap.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest{
    protected WebDriver driver;

    @BeforeClass
    public void Startup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testffc.nimapinfotech.com/");
    }
    @AfterClass
    public void Stop(){
        if(driver!=null){
            driver.quit();
        }
    }

    public void login(String email,String password){
        driver.findElement(By.xpath("//*[@id='mat-input-0']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id='mat-input-1']")).sendKeys(password);
        driver.findElement(By.id("kt_login_signin_submit")).click();
    }

    public boolean isLoginSuccessful() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.urlContains("/dashboard"));
            WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class=\"kt-subheader__title kt-padding-l-10 ng-star-inserted\"]")));
            return dashboardElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password) {
        System.out.println("Testing login with " + email + " / " + password);
        login(email, password);
        Assert.assertTrue(isLoginSuccessful(), "Login failed!");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
//                {"jatinsoni291302@gmail.com", "Jatin@731"}
                {"jsony072@gmail.com","Jatin@731"}
        };
    }
    @Test
    public void testPunchIn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Puch In")));
        WebElement PunchBtn= driver.findElement(By.partialLinkText("Puch In"));
        PunchBtn.click();
        System.out.println(driver.getTitle());
    }


}
