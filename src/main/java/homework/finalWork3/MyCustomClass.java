package homework.finalWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyCustomClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Количество строк: ");
        int countLine = 0;
        while (true) {
            try {
                countLine = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException e) {
                System.out.println("Введите число");
            }
        }
        String[] array = new String[countLine];
        int[] arrayCount = new int[countLine];
        for (int i = 0; i < countLine; i++) {
            System.out.print("строка: " + (i + 1) + " ");
            array[i] = reader.readLine();
            arrayCount[i] = (int) array[i].chars().distinct().count();
        }

        int max = Arrays.stream(arrayCount).max().getAsInt();
        for (int i = 0; i < countLine; i++) {
            if (arrayCount[i] == max) {
                System.out.println("Ответ: " + array[i]);
                break;
            }
        }
    }
}

//Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
// Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
//Пример для теста работы программы:
//Количество строк: 3
//Строка 1: привет
//Строка 2: анализ
//Строка 3: 111111111111
//Ответ: привет

