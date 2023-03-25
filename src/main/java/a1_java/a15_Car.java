package a1_java;

public class a15_Car implements a15_Transport{

    @Override
    public void go() {
        System.out.println("go car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }
}
