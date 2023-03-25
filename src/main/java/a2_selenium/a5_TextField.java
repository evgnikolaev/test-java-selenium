package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a5_TextField {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");


        WebElement inp = driver.findElement(By.xpath("//input[@id='searchInput']"));

        //.sendKeys()  - задать value у инпута
        inp.sendKeys("Hello world");

        //.getAttribute() - верни значение атрибута
        System.out.println( inp.getAttribute("value"));

        //.clear()  - очистить value
        inp.clear();
    }
}
