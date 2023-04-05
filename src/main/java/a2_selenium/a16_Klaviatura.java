package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a16_Klaviatura {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/wiki/");


        WebElement inp = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        inp.sendKeys("text");
        inp.sendKeys("text2");

        //shift+ текст
        inp.sendKeys(Keys.chord(Keys.SHIFT, "test Keys"));

        //Keys.chord(Keys.CONTROL, "a");
        //Keys.chord(Keys.CONTROL, "x");
        //Keys.chord(Keys.CONTROL, "v");


        //нажать Enter
        inp.sendKeys(Keys.ENTER);
    }
}
