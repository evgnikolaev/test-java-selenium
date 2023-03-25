package a1_java;

public class a14_OOP_Abstract {
    public static void main(String[] args) {

        //Абстрактные классы - шаблон, описываем методы без реализации.
        //В наследниках переопределяем

        a14_Cat cat = new a14_Cat();
        a14_Dog dog = new a14_Dog();

        dog.walk("Park");
        dog.sayHello();
        cat.sayHello();
    }

}
