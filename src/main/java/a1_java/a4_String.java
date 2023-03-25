package a1_java;

public class a4_String {

    public static void main(String[] args) {

        String s = "Hello world";

        //Строка не примитивный тип!
        //Сравнение строки на совпадение
        System.out.println(s.equals("Hello world")); //true
        System.out.println(s.equals("Hello")); //false

        System.out.println(s.equalsIgnoreCase("HeLLO world"));//true

        //Регистр
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.charAt(2)); // l - дай символ по индексу
        System.out.println(s.indexOf("worl")); // 6 верни индекс, если есть (-1 если нет)


        System.out.println(s.contains("world")); // есть ли подстрока
        System.out.println(s.length()); // длина


        System.out.println(s.startsWith("Hell")); // Начинается ли с подстроки
        System.out.println(s.endsWith("Hell")); // Заканчивается ли с подстроки
        System.out.println(s.substring(1, 5)); // вырежи подстроку

        String[] arr = s.split(","); //Разбей строку в массив


        // Шаблон %s - строка,   %d - целое число
        String str = "My name is %s! I'm %d years old!";
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age));


        String age2 = "30";
        int a = Integer.parseInt(age2); //Привели к числу
        //System.out.println(age2 * 3); // разные типы, не будет работать
        System.out.println(a * 3);

        //Конкатенация строк (помимо +)
        System.out.println(s.concat(" concat"));

    }
}
