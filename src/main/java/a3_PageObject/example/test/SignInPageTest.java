package a3_PageObject.example.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPageTest {


    private WebDriver driver;
    private SignInPage signInPage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tomas33.ru/authentication");
        signInPage = new SignInPage(driver);

    }


    @Test
    public void createAccount() {
        SignInPage newSignInPage = signInPage.emailInsert("email@mail.ru");
        SignInPage errorNewSignInPage = newSignInPage.createInvalidAction("asd", "zxczxc");
        Assert.assertEquals("Обнаружено ошибок: 1", errorNewSignInPage.getErrorText());
    }


    @After
    public void finish() {
        driver.quit();
    }
}
