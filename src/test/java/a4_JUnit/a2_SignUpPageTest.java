package a4_JUnit;

import a3_PageObject.LoginPage;
import a3_PageObject.SignUpPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a2_SignUpPageTest {

    //Пишем тесты на страницы папки a3_PageObject

    private WebDriver driver;
    private SignUpPage signUpPage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/join");
        signUpPage = new SignUpPage(driver);
    }


    //Проверка, переходит ли на страницу Login
    @Test
    public void LoginTest() {
        LoginPage loginPage = signUpPage.clickSignIn();
        String heading = loginPage.getHeadingText();
        System.out.println(heading);
        Assert.assertEquals("Sign in to GitHub", heading);
    }



    //Проверка, на невалидное имя 1
    @Test
    public void registerFailName() {
        SignUpPage signUpPage2 = signUpPage.registerWithInvalidCreds("testName", "testEmail", "testPassword");
        String errorNameText = signUpPage2.getErrorNameText();
        Assert.assertEquals("Username testName is not available.", errorNameText);

    }

    //Проверка, на невалидное имя 2
    @Test
    public void registerFailName2() {
        SignUpPage signUpPage2 = signUpPage.registerWithInvalidCreds(" as@", "testEmail", "testPassword");
        String errorNameText = signUpPage2.getErrorNameText();
        Assert.assertEquals("Username may only contain alphanumeric characters or single hyphens, and cannot begin or end with a hyphen.", errorNameText);

    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
