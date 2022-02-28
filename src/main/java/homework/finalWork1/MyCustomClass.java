package homework.finalWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double exchangeRate = -1;
        double rub = -1;
        while (true) {
            try {
                if (exchangeRate <= 0) {
                    System.out.println("Введите текущий курс доллара");
                    exchangeRate = Double.parseDouble(reader.readLine());
                    if (exchangeRate == 0) {
                        System.out.println("Введите курс больше 0");
                        continue;
                    }
                } else {
                    System.out.println("Введите количество рублей");
                    rub = Double.parseDouble(reader.readLine());
                    System.out.println("Курс доллара: " + exchangeRate);
                    System.out.println("Количество рублей: " + rub);
                    System.out.println("Итого: " + String.format("%.2f", rub / exchangeRate) + " долларов");
                    break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Введите число");
            }
        }
    }
}


// Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
// Пример для теста работы программы:
//- Курс доллара: 67,55
//- Количество рублей: 1000
//- Итого: 14,80 долларов