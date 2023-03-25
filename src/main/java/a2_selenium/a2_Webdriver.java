package a2_selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

public class a2_Webdriver {
    public static void main(String[] args) {

        /*
        https://www.selenium.dev/documentation/webdriver/getting_started/
        1) Создаем maven проект.

        2) Ставим  в pom.xml зависимость:

          <dependencies>
             <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                    <artifactId>selenium-java</artifactId>
                    <version>3.141.59</version>
                </dependency>
            </dependencies>


        3) Скачиваем драйвер для браузера
        https://chromedriver.chromium.org/downloads




        Здесь про установку хорошо обясняют:
        https://www.youtube.com/watch?v=Yg9KdvAbEHg&list=PLzf74dZga1fQ5Hw7xk1B3dRso0nu-F4dg&ab_channel=LookLiveQA
        https://mvnrepository.com/
        */

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Ожидания (Иногда не все элементы могут сразу загрузиться)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //.get() - открыть
        driver.get("https://www.google.ru/");


        //.navigate() - работа с браузером
        //.to() - открыть, (аналог метода .get())
        driver.navigate().to("https://ru.wikipedia.org/");
        //.back() - вернуться на предыдущую страницу
        driver.navigate().back();
        //.forward() - вперед в браузере
        driver.navigate().forward();
        //.refresh() - перезагрузить страницу
        driver.navigate().refresh();


        //закрыть
        //driver.quit();


        //.getTitle() - получить title текущей страницы
        System.out.println(driver.getTitle());

        //.getCurrentUrl() - получить url текущей страницы
        System.out.println(driver.getCurrentUrl());


        //.manage().window() - Управление окном браузера
        driver.manage().window().maximize(); //окно на весь экран
        driver.manage().window().setSize(new Dimension(900, 600)); //окно на весь экран

    }
}



