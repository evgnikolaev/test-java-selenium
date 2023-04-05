package a2_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a13_js {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");

        //Работа с js
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,520)", "");


        //задержка
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        jse.executeScript("alert('hello');");
        // .switchTo().alert().accept() - работа с alert (нажмем ок на alert, confirm)
        // .switchTo().alert().dismiss(); -  работа с alert (нажмем отмена на alert, confirm)
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }
}
