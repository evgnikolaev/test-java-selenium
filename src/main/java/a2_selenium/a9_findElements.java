package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class a9_findElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://bootstrap-4.ru/docs/5.0/forms/checks-radios/");



        List<WebElement> checkboxes = driver.findElements(By.xpath("(//*[@class='bd-example'])[1]//input"));
        checkboxes.get(1).click();
        System.out.println(checkboxes.size());

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
    }
}
