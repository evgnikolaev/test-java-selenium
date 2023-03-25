package a1_java;

public class a11_Exeptions {

    public static void main(String[] args) {

        //Можем обернуть в try/catch
        try {
            devide(10, 0);

            // ArithmeticException наследуется от Exception (более конкретезировано)
        } catch (ArithmeticException e) {
            System.out.println("in Exception");
            e.printStackTrace();
        }catch (ArrayStoreException e){
            // например другой тип Exception
        }
        finally {
            System.out.println("Finally");
        }

    }


    // Укажем, что метод выбрасывает исключение: throws ArithmeticException
    static void devide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Можем выбросить исключение
            throw new ArithmeticException("Арифметическая ошибка");
        }
        System.out.println(a / b);
    }


}
