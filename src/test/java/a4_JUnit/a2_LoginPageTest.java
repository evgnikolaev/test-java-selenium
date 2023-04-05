package a4_JUnit;

import a3_PageObject.LoginPage;
import a3_PageObject.SignUpPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a2_LoginPageTest {

    //Пишем тесты на страницы папки a3_PageObject

    private WebDriver driver;
    private LoginPage loginPage;



    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        loginPage = new LoginPage(driver);
    }


    //Проверка авторизации
    @Test
    public void loginWithIncorectCreds() {
        LoginPage loginPage2 = loginPage.loginWithInvalidCreds("testName", "testPassword");
        String errorNameText = loginPage2.getErrorText();
        Assert.assertEquals("Incorrect username or password.", errorNameText);
    }

    @Test
    public void loginWithEmptyCreds() {
        LoginPage loginPage2 = loginPage.loginWithInvalidCreds("", "");
        String errorNameText = loginPage2.getErrorText();
        Assert.assertEquals("Incorrect username or password.", errorNameText);
    }



    @After
    public void tearDown() {
        driver.quit();
    }
}
