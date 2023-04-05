package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a14_browserTabsWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://learn.javascript.ru/window-methods");


        //По умолчанию selenium, после того, как откроется новое окно при клике например, продолжает работать в старом окне
        WebElement element = driver.findElement(By.xpath("//*[@id='64l10ijx90']//*[@data-action='run']"));
        element.click();


        //driver.getWindowHandles() - массив имен окон или вкладок
        //driver.getWindowHandles() - имя окна или вкладки
        //Методы оодни и для работы с вкладками, и для работы с окнами
        String mainWindow = driver.getWindowHandle();


        //переключимся на последнее окно
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            System.out.println('1');
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='sitetoolbar__nav-toggle']")).click();


        //Переключимся обратно на главное окно, вкладку
        driver.switchTo().window(mainWindow);
    }
}
