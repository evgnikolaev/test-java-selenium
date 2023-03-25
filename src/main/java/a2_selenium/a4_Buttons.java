package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a4_Buttons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");


        WebElement btn = driver.findElement(By.xpath("//input[@id='searchButton']"));

        //.get... - получить что-то,   (getText() - получить текст кнопки)
        System.out.println(btn.getText());
        System.out.println(btn.getTagName());

        //.click() - клик по кнопке
        //.submit() - клик по кнопке, отправить форму
        btn.click();
        //inp.submit();
    }
}
