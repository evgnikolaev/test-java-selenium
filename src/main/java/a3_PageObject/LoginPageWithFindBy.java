package a3_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithFindBy {

    private WebDriver driver;

    public LoginPageWithFindBy(WebDriver driver) {
        this.driver = driver;
    }


    /*  PageFactory - другая запись, использование аннотаций @FindBy. При этом класс будет вызываться как:
            LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
            loginPage.LoginWithInvalidCreds("asd", "asd");
    */

    @FindBy(xpath = "//*[@id='login_field']")
    private WebElement loginFiled;
    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordFiled;
    @FindBy(xpath = "//*[@name='commit']")
    private WebElement signInButton;
    @FindBy(xpath = "//h1")
    private WebElement heading;
    @FindBy(xpath = "//*[@id='js-flash-container']")
    private WebElement error;


    //Изменить поля логин, password
    public LoginPageWithFindBy typeUserName(String login) {
        loginFiled.sendKeys(login);
        return this;
    }

    public LoginPageWithFindBy userPassword(String password) {
        passwordFiled.sendKeys(password);
        return this;
    }


    public LoginPageWithFindBy LoginWithInvalidCreds(String username, String password) {
        this.typeUserName(username);
        this.userPassword(password);
        signInButton.click();
        return new LoginPageWithFindBy(this.driver);
    }


    public String getHeadingText() {
        return heading.getText();
    }

    public String getErrorText() {
        return error.getText();
    }
}
