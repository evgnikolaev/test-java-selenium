package a2_selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class a20_phantomJS {
    public static void main(String[] args) {


        //Отработка тестов без запуска браузера
        //PhantomJS - сборка движка webkit.   https://phantomjs.org/download.html
        //Нужно ставить зависимости в pom.xml
        //Но здесь бывают пролемы


        System.setProperty("phantomjs.binary.path", "C:\\chromedriver\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();

        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/wiki/");


        WebElement inp = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        inp.sendKeys(Keys.chord(Keys.SHIFT, "test2 Keys"));

        // Cоздание скриншота
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //скриншот вынести на диск
            FileUtils.copyFile(screenshot, new File("C:\\Users\\e.nikolaev\\Pictures\\22.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
