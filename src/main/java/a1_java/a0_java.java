package a1_java;

public class a0_java {
    public static void main(String[] args) {
        /*


            byte a = -127;
            short b = -32767;
            int c = 1000000;
            long d = 1000000000;

            double e = 13.33;
            float f = 1.22f;

            boolean g = true;

            String str = "string type";
            char h = 'a';



        -------------------------------------------



            String[] str1;
            str1 = new String[4];

            String[] str2 = new String[3];

            String[] str3 = {"adf", "asdaaaa"};



        -------------------------------------------



            str.equals("Hello");
            str.equalsIgnoreCase("Hello");
            str.toLowerCase();
            str.toUpperCase();
            str.charAt(1);
            str.contains("el");
            str.length();
            str.startsWith("he");
            str.endsWith("lo");
            str.split("l")
            str.substring(1, str.length() - 1)
            str.concat(" world")

            String.format("Name is %s","Petya")
            Integer.parseInt("30")



        -------------------------------------------



            // foreach
            String[] arr = {"1","2","3"};
            for (String elem : arr) {
                System.out.println(elem);
            }



        -------------------------------------------



            // динамический массив
             List<Integer> list = new ArrayList<>();
                .add (val)
                .set (index,val)
                .remove (index)
                .get (index)
                .size()
                .isEmpty()
                .clear()
                .contains (val)

                .addAll (list2)
                .removeAll (list2)
                .containsAll (list2)



                for (int el : list) {
                    System.out.println(el);
                }


                Iterator<Integer> iterator = list.iterator();
                while(iterator.hasNext()){
                     System.out.println(  iterator.next()  );
                }




        -------------------------------------------




                //уникальный набор
                Set<Integer> set = new HashSet();
                    .add (val)
                    .remove(val)
                    .get ()  - нет
                    .size()
                    .clear()
                    .contains (val)


                for (int i: set) {
                    System.out.println(i);
                }


                Iterator<Integer> iterator = set.iterator();
                while(iterator.hasNext()){
                     System.out.println(  iterator.next()  );
                }





        -------------------------------------------





                Map<Integer, String> map = new HashMap<>();
                     ключ д.б. уникальным
                        .put( key, val)
                        .size()
                        .clear()
                        .containsKey( key )
                        .containsValue( val )
                        .get( key )


                // набор Set из ключей
                Set<Integer> set = map.keySet()




        -------------------------------------------





                //перегрузка методов
                public static void main(String[] args) {
                    int[] arr = {1, 3, 4};

                    getSum(4, 6);
                    System.out.println(getSum(arr));
                }


                static int getSum(int x, int y) {
                    return x + y;
                }

                static int getSum(int[] arr) {
                    for (int i = 0; i <= arr.length; i++) {
                        if (i == 2) {
                            return arr[i];
                        }
                    }
                    return 0;
                }







        -------------------------------------------






                public static void main(String[] args) {
                    try {
                        devide(10, 0);
                    } catch (ArithmeticException e) {
                        System.out.println("error");
                    }
                }


                static void devide(int a, int b) throws ArithmeticException {
                    throw new ArithmeticException("adsfadf");
                }







        -------------------------------------------







            public interface AnimalInterface {
                public void sound();
            }


            public abstract class AnimalAbstract {
                abstract void walk();
            }



            public class Animal extends AnimalAbstract implements AnimalInterface {
                String name;
                protected int numb;


                public Animal() {
                }

                public Animal(String color) {
                    this.name = name;
                }



                public void walk(String place) {
                    System.out.println("walk" + place);
                }

                public void sound(){
                    System.out.println("sound");
                }



                static int var = 10;
                final static int var2 = 20;
                static void method(){
                }
            }



           public - везде
           protected - в классе и в наследнике
           private - в классе
           без модификатора - видимость в пределах папки (package)









        -------------------------------------------




        Полезные клавиши:
            Alt+Insert - вставка конструктора класса, геттеров, сеттеров
            Ctrl+O  - Список методов, которые можно переопределить
            Ctrl+Alt+T - обернуть код в инструкцию
            Alt+F7 , Ctrl+Alt+F7  - где встречается метод
            Ctrl+N - Найти класс
            Shift+F6 - Переименовать массово класс




        */



    }
}
