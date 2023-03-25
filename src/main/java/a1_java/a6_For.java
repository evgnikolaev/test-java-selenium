package a1_java;

public class a6_For {
    public static void main(String[] args) {

        //for
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i * 10;
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(arr[i]);
        }


        //foreach
        System.out.println();
        for (int elem : arr) {
            System.out.println(elem);
        }


        //while
        System.out.println();
        int i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println(i);
            i++;
            if (i == 5) bool = false;
        }


        //do
        System.out.println();
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);


    }
}
