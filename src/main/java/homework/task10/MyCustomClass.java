package homework.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите кол-во столбцов");
            int column = getNumber(reader);
            System.out.println("Введите кол-во строк");
            int row = getNumber(reader);

            int[][] array = new int[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.println("Введите число тип int в элемент [" + i + "] [" + j + "]  массива");
                    array[i][j] = Integer.parseInt(reader.readLine());
                }
            }

            System.out.println("Выводим первую строку матрицы умноженную на 3");
            for (int i = 0; i < column; i++) {
                System.out.print(array[0][i] * 3 + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNumber(BufferedReader reader) {
        int value = 0;
        do {
            System.out.println("Число должно быть больше нуля");
            try {
                value = Integer.parseInt(reader.readLine());
                if (value < 0) {
                    value = 0;
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число. Введите число");
            } catch (Exception e) {
                System.out.println("Введите число больше нуля");
            }
        } while (value == 0);
        return value;
    }
}

//Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
// а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
// Размерность матрицы задается пользователем.