package homework.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число : ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число : ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите оператор :1");
        String operator = reader.readLine();
        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new Exception("Такого оператора нет");
        }
        System.out.println("Результат = " + result);
    }
}
