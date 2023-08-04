package a2_selenium;

public class a0_Webdriver {
    /*
            Поиск в консоли браузера:
                $$('css-селектор')
                $x('Xpath-селектор')

            //
            /
            [@atribute ..]
            (//input[@class="OouJcb"])[2]
             .
             ..

             ancestor::
             ancestor-of-self::
             following-sibling::
             preceding-sibling::
             parent::


             Функции Xpath:
                last() - последний из коллекции
                text() - по тексту, содержимому
                contains() - содержит ли
                start-with() - начинается ли
                    h1[contains(text(),'How people')]




        -------------------------------------------




            driver:
                ChromeDriver / FirefoxDriver / EdgeDriver
                PhantomJSDriver (без запуска браузера)



            driver.get();
            driver.getTitle()
            driver.getCurrentUrl()
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.quit();


            driver.manage().window()
                .maximize();
                .setSize(new Dimension(640, 320));


            driver.navigate()
                .to("https://ru.wikipedia.org/");
                .back();
                .forward();
                .refresh();


            driver.findElement
                By.linkText
                By.partialLinkText
                By.name
                By.className
                By.id
                By.tagName
                By.cssSelector
                By.xpath




            // Проверка на существование элемента
            if (driver.findElements().size() > 0){
                System.out.println("Нашли элемент");
            }




        -------------------------------------------




            WebElement a
                    .getText()
                    .click()


            WebElement btn
                    .getText()
                    .click()
                    .submit()
                        .isEnabled()
                        .isDisplayed()


            WebElement input
                    .getAttribute("value")
                    .clear()
                    .sendKeys()
                    input.sendKeys(Keys.chord(Keys.SHIFT, "test Keys"));
                            Keys.ENTER
                            Keys.chord(Keys.CONTROL, "a")


            WebElement input[@type='file']
                    .sendKeys("C:\\test.png")



            WebElement checkbox, radio
                    .click()
                        .isSelected()


            WebElement select (можно на селект кликнуть потом на опцию, можно сразу на опцию)
                    select.click()
                    option.click()




         -------------------------------------------




            List<WebElement> checkboxes = driver.findElements();
            checkboxes.get(2).click();
            checkboxes.size()

            for(WebElement el: checkboxes){
                el.click();
            }






         -------------------------------------------




            driver.manage().timeouts().setScriptTimeout(3000, TimeUnit.MILLISECONDS);   - неявное ожидания появления элемента на странице
            driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);    - неявное ожидания полной загрузки страницы
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);            - неявное ожидания выполнения асинхронного запроса

            Duration duration = Duration.ofSeconds(3);
            WebDriverWait wait = new WebDriverWait(driver, duration);                   - явное ожидание

             try {
                driver.get("https://guruweba.com/html/sozdanie-tablits-v-html-vse-o-html-tablitsakh/");
            } catch (Exception e) {}


            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath()));       как появиться, загрузится
                    ExpectedConditions.visibilityOfElementLocated(By.xpath()));     как только будет видна (всплывашка)
                    ExpectedConditions.invisibilityOfElementLocated(By.xpath()));   как только пропадет (всплывашка)





         -------------------------------------------



            Actions actions = new Actions(driver);

            actions
                .moveToElement(element)         - навести на элемент
                .dragAndDrop(element, link)     - перенести один элемент на другой
                .doubleClick(element)           - двойной клик
                .contextClick(element)          - клик правой кнопкой мыши
                .build().perform()              - собрать и выполнить

                .clickAndHold()                 - кликнуть и не отпускать клавишу
                .release()                      - отпустить клавишу мыши

                actions.clickAndHold(element).moveToElement(link).release().build().perform();




         -------------------------------------------



            //js
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("confirm(2)");



            //alert
                Thread.sleep(3000);
                driver.switchTo().alert().accept()    - переключись на alert, нажми ok
                driver.switchTo().alert().dismiss()



            //вкладки, окна
                String mainTab = driver.getWindowHandle();

                for(String tab:driver.getWindowHandles()){
                    driver.switchTo().window(tab);      - переключись на последнюю вкладку
                }

                driver.switchTo().window(mainTab);      - переключись на определенную (1-ую) вкладку






         -------------------------------------------



            Date dateNow = new Date();
            SimpleDateFormat format = new SimpleDateFormat("hh-mm-ss");
            String fileName = format.format(dateNow) + ".jpg";

            // скриншоты
            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("C:\\Users\\e.nikolaev\\Downloads\\" + fileName));   - pom.xml ставим пакет






         -------------------------------------------




             JUnit:
                @BeforeClass - в самом начале один раз перед всеми методами
                @AfterClass - в самом конце один раз после всех методов
                @Before - перед каждым тестовым методом
                @After - после каждоого тестового метода
                @Test - позволяет указать на тестовый метод
                @Ignore - не выполнять тестовый метод



            Assert:
            .assertTrue(1 + 1 == 2) - проверка на true
            .assertFalse(1 + 1 == 10)- проверка на false

            .assertNull() - проверка на Null
            .assertNotNull() - проверка на Null

            .assertEquals(10, 5 + 5) - проверка на сравнение
            .assertNotEquals(10, 5 + 5) - проверка на сравнение


            .assertTrue("Метод провалился",1 + 1 == 12) - Можно 1-м параметром передавать сообщение при провале теста
            Тесты могут выполняться в любом порядке, они должны быть независимые.





     */


}
