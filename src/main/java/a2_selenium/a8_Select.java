package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class a8_Select {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cherkizovo-group.com/press/");


       //Нажимаем на сформированный js-ом селект, нажимаем на опциию
       driver.findElement(By.xpath("(//*[contains(@class,'choices__item') and  contains(text(),'Месяц')])[1]")).click();
       driver.findElement(By.xpath("(//*[contains(@class,'choices__item') and  contains(text(),'Февраль')])")).click();
    }
}
