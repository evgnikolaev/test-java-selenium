package a1_java;

public class a13_Animal {
    String name;
    String color;


    /*
    В идеале должны макисально ограничивать доступ.
    Для изменения приватных свойств и методов используются геттеры и сеттеры (класс Dog)

    Инкапсуляция - модификаторы доступа
        public - доступен везде, везде можно переопределить, и в других пакетах( папках package)
        private - доступен только в родительском классе!
        protected - доступен в родительском классе и в классе наследника
        protected - !! Во внешнем пакете (если класс лежит в другом пакете (папке package)) доступа не будет, Если от класса нет наследования
        Если не указан модификатор, доступно только этом пакете
     */

    public int var = 10;
    private int var2 = 20;
    protected int var3 = 30;


    public void walk(String place) {
        System.out.println("Walk in " + place);
        this.var = 100;
        this.var2 = 200;
        this.var3 = 300;
    }

    public void sleep() {
        System.out.println("sleep");
    }


    //Полиморфизм - в классах наследниках будут такие же методы. Их можно переопределить (@Override).
    public void sound (){
        System.out.println("sound animal");
    }
}
