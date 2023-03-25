package a1_java;

public class a13_OOP_Princips {
    public static void main(String[] args) {

        //Наследование
        a13_Cat cat = new a13_Cat();
        a13_Dog dog = new a13_Dog();


        cat.name = "Vasya";
        cat.color = "white";

        dog.name = "Petya";
        dog.color = "black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");


        //Инкапсуляция - модификаторы доступа (Классs Animal, Dog, OOP)
        dog.var = 10000;
        //dog.var2 = 20000;// приватная
        dog.var3 = 30000;//протектед
        System.out.println(dog.var3);

        //геттеры/сеттеры
        System.out.println(dog.getWeight());
        dog.setWeight(5);
        System.out.println(dog.getWeight());

        //Полиморфизм
        dog.sound();
        cat.sound();
    }
}
