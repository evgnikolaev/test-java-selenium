package a3_PageObject.example.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {


    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tomas33.ru/authentication");
        loginPage = new LoginPage(driver);
    }


    @Test
    public void loginAction() {
        LoginPage newLoginPage = loginPage.loginAction("email@mail.ru","123");
         Assert.assertEquals("Обнаружено ошибок: 1",   newLoginPage.getError());
    }


    @After
    public void finish() {
        driver.quit();
    }

}
