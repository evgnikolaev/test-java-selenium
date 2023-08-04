package a3_PageObject.example.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;

    By emailField = By.xpath("//*[@id=\"email_create\"]");
    By emailSubmit = By.xpath("//*[@id=\"SubmitCreate\"]");
    By nameFiled = By.xpath("//*[@id=\"customer_firstname\"]");
    By lastNameFiled = By.xpath("//*[@id=\"customer_lastname\"]");
    By submitAccount = By.xpath("//*[@id=\"submitAccount\"]");

    By errorText = By.xpath("//h1/following-sibling::*[@class=\"alert alert-danger\"]/p");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage emailInsert(String email) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(emailSubmit).click();
        return new SignInPage(driver);
    }

    public SignInPage nameInsert(String name) {
        driver.findElement(nameFiled).sendKeys(name);
        return this;
    }

    public SignInPage lastNameInsert(String name) {
        driver.findElement(lastNameFiled).sendKeys(name);
        return this;
    }

    public SignInPage createInvalidAction(String name, String lastName) {
        this.nameInsert(name);
        this.lastNameInsert(lastName);
        driver.findElement(submitAccount).click();
        return new SignInPage(driver);
    }

    public String getErrorText() {
        return driver.findElement(errorText).getText();
    }

}
