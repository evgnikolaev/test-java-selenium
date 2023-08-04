package a3_PageObject.example.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    By h1 = By.xpath("//h1");
    By emailField = By.xpath("//*[@id=\"email\"]");
    By passlField = By.xpath("//*[@id=\"passwd\"]");
    By submitBtn = By.xpath("//*[@name=\"SubmitLogin\"]");
    By errorText = By.xpath("//h1/following-sibling::*[@class=\"alert alert-danger\"]/p");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getHeading() {
        return driver.findElement(h1).getText();
    }


    public LoginPage insertEmail(String str) {
        driver.findElement(emailField).sendKeys(str);
        return this;
    }

    public LoginPage insertPassw(String str) {
        driver.findElement(passlField).sendKeys(str);
        return this;
    }

    public LoginPage loginAction(String email, String passw) {
        this.insertEmail(email);
        this.insertPassw(passw);
        driver.findElement(submitBtn).click();
        return new LoginPage(driver);
    }

    public String getError() {
       return driver.findElement(errorText).getText();
    }

}
