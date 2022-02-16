package homework.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.DoubleStream;

public class MyCustomClass {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] array = new double[3];
        for (int i = 0; i < 3; i++) {
            array[i] = Double.parseDouble(reader.readLine());
        }

        double avg = DoubleStream.of(array)
                .average()
                .orElseThrow(() -> new Exception("Объект-контейнер OptionalDouble хранит в себе значение null"));

        double avgHalf = Math.floor(avg / 2);

        System.out.println("Среднее арифметическое = " + avg);
        System.out.println("Среднее арифметическое делим на два и округляем в меньшую сторону и получаем " + avgHalf);
        if (avgHalf > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

