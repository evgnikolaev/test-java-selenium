package a3_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPage {

    private final WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By heading = By.xpath("//h1");
    private final By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
    private final By userNameFiled = By.xpath("//*[@id='user_login']");
    private final By userEmailFiled = By.xpath("//*[@id='user_email']");
    private final By userPasswordFiled = By.xpath("//*[@id='user_password']");
    private final By signUpFormButton = By.xpath("//*[@id='signup_button']");
    private final By errorNameField = By.xpath("//*[@id='user_login']//ancestor::dl//*[@class='mb-1']");



    //Нажимаем на кнопку "Авторизация"
    public LoginPage clickSignIn() {
        driver.findElement(signInButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new LoginPage(driver);
    }


    //Изменить поля логин, email, password
    public void typeUserName(String username) {
        driver.findElement(userNameFiled).sendKeys(username);
    }

    public void typeEmailFiled(String email) {
        driver.findElement(userEmailFiled).sendKeys(email);
    }

    public void userPasswordFiled(String password) {
        driver.findElement(userPasswordFiled).sendKeys(password);
    }



    //Некорректная отправка формы
    public SignUpPage registerWithInvalidCreds(String username, String email, String password) {
        this.typeUserName(username);
        this.typeEmailFiled(email);
        this.userPasswordFiled(password);
        driver.findElement(signUpFormButton).click();
        return new SignUpPage(driver);
    }


    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getErrorNameText() {
        return driver.findElement(errorNameField).getText();
    }

}
