package a1_java;

public class a5_If {
    public static void main(String[] args) {


        int i = 7;
        if (i > 10) {
            System.out.println("i>5");
        } else if (i < 10 && i > 5) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }



        i = 3;
        switch (i) {
            case 1:
                System.out.println("case 1");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default");
        }

    }
}
