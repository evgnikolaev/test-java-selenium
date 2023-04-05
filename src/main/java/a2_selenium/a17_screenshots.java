package a2_selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class a17_screenshots {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/wiki/");


        WebElement inp = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        inp.sendKeys(Keys.chord(Keys.SHIFT, "test Keys"));



        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String filename = format.format(dateNow) + ".png";



        // Cоздание скриншота
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //скриншот вынести на диск (нужно подключить зависимость pom.xml)
            FileUtils.copyFile(screenshot, new File("C:\\Users\\e.nikolaev\\Pictures\\"+filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
