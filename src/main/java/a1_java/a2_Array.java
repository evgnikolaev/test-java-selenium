package a1_java;

public class a2_Array {

    public static void main(String[] args) {

        //Пример1
        String[] names;   //Массив из строк
        names = new String[3];   // укажем длину массива


        //Пример2. Короткая запись
        String[] str = new String[3];
        int[] arr = new int[10];


        //Пример3. Сразу объявляем переменную, и присваиваем значения
        int[] arr2 = {15, 10, 100, 44, 23, 5};

        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }


        String[] name = new String[3];
        name[0] = "Vasya";
        name[1] = "Petya";
        name[2] = "Vanya";

        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }

    }
}
