package homework.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    static final String x = "x";
    static final String y = "y";
    static final String z = "z";

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

            String[] array = new String[arraySize];
            int i = 0;

            do {
                System.out.println("Введите текст для [" + i + "] элемента массива");
                String inputline = reader.readLine();
                switch (inputline) {
                    case x:
                    case y:
                    case z:
                        System.out.println("Данное значение имеется в константах");
                }
                array[i++] = inputline;
                arraySize--;
            } while (arraySize > 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
