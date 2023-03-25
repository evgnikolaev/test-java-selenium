package a1_java;

public class a10_Methods {
    public static void main(String[] args) {


        int result = getSum(1, 10);
        System.out.println(result);

        result = getSum(1, 10, 45);
        System.out.println(result);

        int[] arr = {1, 3, 5};
        result = getSum(arr);
        System.out.println(result);


        sayHello("Vasya");
        sayHello("Vasya", "Petya");
    }


    //static - стфтический метод
    //int - результат вернется integer,   void - ничего не ыозвращает, не должно быть return
    static int getSum(int x, int y) {
        int sum = x + y;
        return sum;
    }


    //Перегрузка методов
    static int getSum(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    //Перегрузка методов
    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    //Перегрузка методов
    static void sayHello(String name, String name2) {
        System.out.println("Hello " + name + name2);
    }
}
