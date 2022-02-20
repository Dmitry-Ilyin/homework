package homework.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    private static final String patternDistance = "Метры %f\n Мили %f\n Ярды %f\n Футы %f\n";
    private static final String patternWeight = "Килограмм %f\nфунт %f\nунция %f\n";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Программа конвертер физических величин");
            double value = 0;
            while (true) {
                System.out.println("Выберите что переводить: 1-масса, 2-расстояние");
                switch (reader.readLine()) {
                    case "1":
                        System.out.println("Выберете единицу измерения: 1-килограмм, 2-фунт, 3-унция");
                        switch (reader.readLine()) {
                            case "1":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternWeight, value, value * 2.20462, value * 35.274));
                                return;
                            case "2":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternWeight, value * 0.453592, value, value * 16));
                                return;
                            case "3":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternWeight, value * 0.0283495, value * 0.0625, value));
                                return;
                            default:
                                System.out.println("Вы ввели неправильное значение");
                        }
                        break;
                    case "2":
                        System.out.println("Выберете единицу измерения: 1-метр, 2-миля, 3-ярд, 4-фут");
                        switch (reader.readLine()) {
                            case "1":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternDistance, value, value * 0.000621371, value * 1.09361, value * 3.28084));
                                return;
                            case "2":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternDistance, value * 1609.34, value, value * 1760, value * 5280));
                                return;
                            case "3":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternDistance, value * 0.9144, value * 0.000568182, value, value * 3));
                                return;
                            case "4":
                                System.out.println("Введите число");
                                value = Double.parseDouble(reader.readLine());
                                System.out.println("Результат :");
                                System.out.println(String.format(patternDistance, value * 0.3048, value * 0.0000189394, value * 0, 33333, value));
                                return;
                            default:
                                System.out.println("Вы ввели неправильное значение");
                        }
                        break;
                    default:
                        System.out.println("Вы ввели неправильное значение");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
