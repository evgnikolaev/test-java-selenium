package a1_java;

public class a13_Dog extends a13_Animal {
    private int weight = 2;


    //Геттеры/Сеттеры для приватной переменной
    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    //Методы присущие к Dog
    public void sit() {
        System.out.println("sit");
        this.var = 1000;
        //this.var2 = 2000;// приватная
        this.var3 = 3000;// протектед
    }

    public void lay() {
        System.out.println("lay");
    }

    //полиморфизм, переопределяем
    @Override
    public void sound() {
        System.out.println("sound dog");
    }
}
