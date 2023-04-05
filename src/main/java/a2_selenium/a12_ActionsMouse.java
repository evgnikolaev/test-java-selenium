package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class a12_ActionsMouse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");

        WebElement link = driver.findElement(By.xpath("//*[@class='dropdown dropdown2']//*[@class='dropbtn']"));
        WebElement element = driver.findElement(By.xpath("//*[@class='dropdown dropdown2']//*[@class='dropbtn']"));

        Actions actions = new Actions(driver);
        //.moveToElement(link).build().perform() - такая запись, чтобы навести на элемент и выполнить метод
        actions.moveToElement(link).build().perform();

        // dragAndDrop() - перенести один элемент на другой. (здесь пример не рабочий)
        actions.dragAndDrop(element, link).build().perform();

        // doubleClick() - двойной клик
        actions.doubleClick(element).build().perform();

        // contextClick() - клик правой кнопкой мыши
        actions.contextClick(element).build().perform();


        // clickAndHold() - кликнуть и не отпускать клавишу , release() - отпустить клавишу мыши
        actions.clickAndHold(element).moveToElement(link).release().build().perform();

        //Можно всю цепочку в предыдущем примере объединить
        Action action = actions.clickAndHold(element).moveToElement(link).release().build();
        action.perform();
    }
}
