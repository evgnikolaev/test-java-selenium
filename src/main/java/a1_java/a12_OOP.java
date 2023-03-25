package a1_java;

public class a12_OOP {
    public static void main(String[] args) {
        //Пример без конструктора
        a12_Car car1 = new a12_Car();
        car1.color = "Black";
        car1.length = 5;
        car1.height = 2;

        car1.addWeight(750);
        car1.drive(120);

        //Пример с конструктором
        System.out.println();
        a12_Car car2 = new a12_Car("red");
        System.out.println(car2.color);


        System.out.println();
        a12_Car car3 = new a12_Car("red", 2100, 2300);
        System.out.println(car3.color);
        System.out.println(car3.height);
        System.out.println(car3.weight);


        //Статичские свойства и методы
        System.out.println(a12_Car.var);
        a12_Car.var = 100;
        System.out.println(car1.var);
        System.out.println(car2.var);

        a12_Car.method();

        //константа
        System.out.println(a12_Car.var2);

    }
}
