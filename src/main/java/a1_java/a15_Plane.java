package a1_java;

public class a15_Plane implements a15_Transport {
    @Override
    public void go() {
        System.out.println("go plane");
    }

    @Override
    public void stop() {
        System.out.println("go plane");
    }

    public void getSpeed(int speed) {
        System.out.println(speed);
    }
}
