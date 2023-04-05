package a3_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By loginFiled = By.xpath("//*[@id='login_field']");
    private final By passwordFiled = By.xpath("//*[@id='password']");
    private final By signInButton = By.xpath("//*[@name='commit']");
    private final By heading = By.xpath("//h1");
    private final By error = By.xpath("//*[@id='js-flash-container']");



    //Изменить поля логин, password
    public void typeUserName(String login) {
        driver.findElement(loginFiled).sendKeys(login);
    }

    public void userPassword(String password) {
        driver.findElement(passwordFiled).sendKeys(password);
    }



    //Некорректная отправка формы
    public LoginPage loginWithInvalidCreds(String username, String password) {
        this.typeUserName(username);
        this.userPassword(password);
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }


    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getErrorText() {
        return driver.findElement(error).getText();
    }
}
