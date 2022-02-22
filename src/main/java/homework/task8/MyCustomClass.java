package homework.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите любое целое положительное число");
            int number = 0;
            while (true) {
                try {
                    number = Integer.parseInt(reader.readLine());
                    if (number < 0) {
                        throw new Exception();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Введите число!");
                } catch (Exception e) {
                    System.out.println("Введите число больше нуля");
                }
            }
            int sum = 0;
            for (int i = number; i > 0; i--) {
                if (i % 2 != 0)
                    sum += i;
            }
            System.out.println("Сумма нечетных чисел равна: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Напишите программу, где пользователь вводит любое целое положительное число n.
// А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.