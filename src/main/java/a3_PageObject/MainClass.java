package a3_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //PageObject - логику тестов разделяем от реализации работы веб страницы.
        //Для каждой страницы отдельный класс, в котором описываем различные методы для страницы.

        //driver.get("https://github.com/join");
        //SignUpPage signUpPage = new SignUpPage(driver);
        //signUpPage.registerWithInvalidCreds("asd", "asd", "www");

        driver.get("https://github.com/login");
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginWithInvalidCreds("asd", "asd");
    }
}
