package homework.task9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.DoubleStream;

public class MyCustomClass {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int arraySize = 0;
            do {
                System.out.println("Введите размер массива. Число должно быть больше нуля");
                try {
                    arraySize = Integer.parseInt(reader.readLine());
                    if (arraySize < 0) {
                        arraySize = 0;
                        throw new Exception();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число. Введите число");
                } catch (Exception e) {
                    System.out.println("Введите число больше нуля");
                }
            } while (arraySize == 0);

            double[] array = new double[arraySize];
            for (int i = 0; i < arraySize; i++) {
                System.out.println("Введите число типа double для [" + i + "] элемента массива");
                array[i] = Double.parseDouble(reader.readLine());
            }

            double avg = DoubleStream.of(array)
                    .average()
                    .orElseThrow(() -> new Exception("Объект-контейнер OptionalDouble хранит в себе значение null"));
            System.out.println("Среднее арифметическое элементов массива: " + avg);

            for (double v : array) {
                System.out.println(v * avg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Напишите программу:
//1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
//2. Посчитайте среднее арифметическое элементов массива.
//3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
