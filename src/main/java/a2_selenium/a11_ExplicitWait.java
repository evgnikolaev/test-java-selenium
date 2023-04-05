package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class a11_ExplicitWait {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://bootstrap-4.ru/docs/5.0/forms/checks-radios/");


        // implicitlyWait - ожидание перед каждым поиском эдемента
        // Создаем явное ожидание  - ожидание, которое используется один раз для какого-то условия
        WebDriverWait wait = (new WebDriverWait(driver, 5));

        // 1) ExpectedConditions.presenceOfElementLocated()  - как появиться, загрузится h1
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Чекбоксы и радиокнопки']")));


        List<WebElement> checkboxes = driver.findElements(By.xpath("(//*[@class='bd-example'])[1]//input"));
        checkboxes.get(1).click();
        driver.findElement(By.xpath("//*[@id='bd-versions']")).click();



        // 2) ExpectedConditions.visibilityOfElementLocated()  - как только будет видна всплывашка
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dropdown-menu dropdown-menu-end show']")));


        checkboxes.get(0).click();


        // 3) ExpectedConditions.visibilityOfElementLocated()  - как только будет всплывашка пропадет
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='dropdown-menu dropdown-menu-end show']")));
    }
}
