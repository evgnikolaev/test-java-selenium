package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a15_Sostoyaniya {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://learn.javascript.ru/window-methods");


        WebElement button = driver.findElement(By.xpath("//*[@id='64l10ijx90']//*[@data-action='run']"));

        System.out.println(button.isEnabled()); //Например проверка button, input
        System.out.println(button.isDisplayed());  //Например проверка button, input
        System.out.println(button.isSelected());  //Например проверка радиобатона
        System.out.println(button.isDisplayed());  //Виден ли элемент на странице?

        //Проверка на отсутствие элементов
        //driver.findElement() - если не найдет элемент, программа выдаст ошибку
        //driver.findElements() - если не найдет, размер массива будет 0

       if (driver.findElements(By.xpath("//*[@id='test']")).size()>0){
           System.out.println("Нашли элемент");
       }else {
           System.out.println("Не нашли элемент");
       }


       driver.quit();
    }
}
