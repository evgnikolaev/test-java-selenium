package a1_java;

public class a15_zOOP_Inerface {

    public static void main(String[] args) {

        //Interface - все методы абстрактные. Можно множествнно наследоваться.

        a15_Car car = new a15_Car();
        a15_Plane plane = new a15_Plane();

        car.go();
        plane.go();
    }


}
