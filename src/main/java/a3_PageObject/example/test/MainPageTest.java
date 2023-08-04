package a3_PageObject.example.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {


    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tomas33.ru/");
        mainPage = new MainPage(driver);

    }


    @Test
    public void getLoginPage() {
        LoginPage loginPage = mainPage.getLoginPage();
        Assert.assertEquals(loginPage.getHeading(), "АВТОРИЗАЦИЯ");
    }


    @After
    public void finish() {
        driver.quit();
    }

}
