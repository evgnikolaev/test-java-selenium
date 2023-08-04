package a4_JUnit;

import org.junit.*;

public class a1_Start {

    /*
        JUnit - библиотека для тестов
        Есть аннотации:
            @BeforeClass - в самом начале один раз перед всеми методами
            @AfterClass - в самом конце один раз после всех методов
            @Before - перед каждым тестовым методом
            @After - после каждоого тестового метода
            @Test - позволяет указать на тестовый метод
            @Ignore - не выполнять тестовый метод

         Для примера ниже последовательность будет:
            beforeClassMethod()

            setUp()
            method1()
            tearDown()

            setUp()
            method2()
            tearDown()

            afterClassMethod()



        Проверка тестов на успешность, используется класс Assert:

            .assertTrue(1 + 1 == 2) - проверка на true
            .assertFalse(1 + 1 == 10)- проверка на false

            .assertNull() - проверка на Null
            .assertNotNull() - проверка на Null

            .assertEquals(10, 5 + 5) - проверка на сравнение
            .assertNotEquals(10, 5 + 5) - проверка на сравнение


             .assertTrue("Метод провалился",1 + 1 == 12) - Можно 1-м параметром передавать сообщение при провале теста


        Тесты могут выполняться в любом порядке, они должны быть независимые.

    */
    @BeforeClass
    public static void beforeClassMethod() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void method1() {
        Assert.assertTrue(1 + 1 == 2);
        Assert.assertFalse(1 + 1 == 10);
        Assert.assertTrue("Метод провалился",1 + 1 == 12);
    }

    @Test
    public void method2() {
        Assert.assertEquals(10, 5 + 5);
    }

    @Test
    @Ignore
    public void method3() {
    }

    @After
    public void tearDown() {
    }

    @AfterClass
    public static void afterClassMethod() {
    }
}
