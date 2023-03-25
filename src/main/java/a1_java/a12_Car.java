package a1_java;

//имя файла = имя класса
public class a12_Car {

    //Конструктор
    public a12_Car() {
        System.out.println("construct");
    }

    public a12_Car(String color) {
        this.color = color;
    }

    public a12_Car(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }



    //Характеристики
    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;



    //добавь массу
    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("New weight " + this.weight);
    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We driving");
        } else {
            System.out.println("Cannot drive");
        }
    }


    //статическая переменная
    static int var = 10;
    static void method(){
        System.out.println("static method");
    }

    //константа
    final static int var2 = 15;
    // также final метод мы переопределить не можем
}
