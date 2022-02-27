package homework.task11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        String a = null;
        int b = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = null;
            b = Integer.MIN_VALUE;
            while (true) {
                if (a == null) {
                    System.out.println("Введите первое число для записи в строковую переменную");
                    a = reader.readLine();
                    if(a == null)
                        throw new Exception();
                    Integer.parseInt(a); //могут ввести не число в виде строки, поэтому тут вызовется ошибка
                } else {
                    System.out.println("Введите второе число для записи в целочисленную переменную");
                    b = Integer.parseInt(reader.readLine());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Выводим максимальное число");
        System.out.println((Integer.parseInt(a) > b ? new Integer(a).doubleValue() : (double) b));
    }
}
