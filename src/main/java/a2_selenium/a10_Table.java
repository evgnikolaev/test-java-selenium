package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a10_Table {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");


        WebElement tableElement = driver.findElement(By.xpath("//*[@id='customers']"));
        a10_TableClass table = new a10_TableClass(tableElement, driver);

        System.out.printf(String.valueOf(table.getRows().size()));
        System.out.printf(String.valueOf(table.getValueFromCell(2,3)));
        System.out.printf(String.valueOf(table.getValueFromCell(2,"Company")));
        driver.quit();
    }
}
