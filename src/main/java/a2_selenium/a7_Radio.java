package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a7_Radio {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ozon.ru/category/krupnaya-bytovaya-tehnika-10501/");



        //Обычно до инпута кликнуть бывает нельзя, крикаем на span например
        WebElement checkbox = driver.findElement(By.xpath("(//*[@class='haa6 ha6a'])[contains(text(),'Gefest')]"));
        checkbox.click();


        //Найдем инпут
        WebElement checkbox1 = driver.findElement(By.xpath("(//*[@class='haa6 ha6a'])[contains(text(),'Indesit')]/ancestor::label//input"));
        checkbox1.click();
        System.out.println(checkbox1.isSelected()); // Проверим выбран или нет
        checkbox1.click();
        System.out.println(checkbox1.isSelected()); // Проверим выбран или нет

        //47
    }
}
