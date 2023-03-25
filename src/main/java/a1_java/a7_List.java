package a1_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a7_List {
    public static void main(String[] args) {
        //Коллекции,
        //Рассмотрим часто встречающийся List - Динамический массив (То есть когда длина массива может динамически меняться)
        //List<Integer> - говорит о том, что будут целые числа,  ArrayList - тип листа(часто встречающийся)

        List<Integer> list = new ArrayList<>();

        // .add - добавь
        list.add(5);
        list.add(10);
        list.add(9);

        // .get - верни
        System.out.println(list.get(1));

        // .set - переопрели
        list.set(2, 100);
        System.out.println(list.get(2));

        // .remove - удали (элементы массива сместятся)
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));

        // .size - размер
        System.out.println(list.size());

        // .clear - очистить
        //list.clear();
        //System.out.println(list.size());


        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);

        // .addAll - добавить элементы одного списка в элементы другого
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());


        // .removeAll - удфлить элементы одного списка в элементы другого
        System.out.println(list.size());
        list.removeAll(list2);
        System.out.println(list.size());


        // .isEmpty - пустой список или нет
        System.out.println(list.isEmpty());


        // .contains - есть ли значение
        System.out.println(list.contains(100));


        // .containsAll - есть ли значения второго списка в первом
        list.addAll(list2);
        list2.add(58);
        System.out.println(list.containsAll(list2)); //false
        System.out.println();



        //ITERATOR
        Iterator<Integer> iterator = list.iterator();

        // .next - следующий
        System.out.println( iterator.next());
        System.out.println( iterator.next());

        // .hasNext - существует ли следующий элемент
        System.out.println(iterator.hasNext());

        while (iterator.hasNext()){
            System.out.println( iterator.next());
        }

    }
}
