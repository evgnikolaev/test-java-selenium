package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a3_Selectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");


        // .findElement - Найти элемент первый
        // By.linkText() - текст ссылки
        WebElement link = driver.findElement(By.linkText("Войти"));

        // By.partialLinkText() - часть текста ссылки
        WebElement link2 = driver.findElement(By.partialLinkText("Nissan Note первого"));

        //By.name() - по атрибуту name, у инпута например
        WebElement inp = driver.findElement(By.name("search"));

        //By.className() - по классу
        WebElement btn = driver.findElement(By.className("searchButton"));

        //By.id() - по id
        WebElement nav = driver.findElement(By.id("p-views"));

        //By.tagName() - по тегу, вернет первый найденный
        WebElement inp2 = driver.findElement(By.tagName("input"));

        //By.cssSelector() - по css селектору
        WebElement nav2 = driver.findElement(By.cssSelector("#p-views"));

        //By.xpath() - по xpath
        WebElement logo = driver.findElement(By.xpath("//*[@id='ca-talk']/a"));

        driver.quit();
    }

//    43
}
