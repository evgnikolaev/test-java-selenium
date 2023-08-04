package a3_PageObject.example.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    By loginLink = By.xpath("(//*[@class=\"header_user_info\"])[1]//a");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }



}
