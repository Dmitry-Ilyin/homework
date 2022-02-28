package homework.finalWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = "";
        boolean flagReadWord = true;
        boolean flagHelp = false;
        int i = 0;
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Напишите правильный ответ :");
        while (flagReadWord) {
            try {
                i++;
                if (i == 1 && !flagHelp) {
                    System.out.println("Попытка номер № " + i + " или введите слово 'подсказка'");
                } else {
                    System.out.println("Попытка номер № " + i);
                }
                inputWord = reader.readLine();
                if ("Заархивированный вирус".equals(inputWord)) {
                    System.out.println("Правильно");
                    return;
                } else if ("Подсказка".equalsIgnoreCase(inputWord)) {
                    if (i == 1 && !flagHelp) {
                        System.out.println("Тут должна быть подсказка");
                        flagHelp = true;
                    } else {
                        System.out.println("Подсказка уже не доступна");
                    }
                    i--;
                    continue;
                }
                if (i == 3 || flagHelp) {
                    flagReadWord = false;
                    System.out.println("Обидно, приходи в другой раз");
                    return;
                }
                System.out.println("Подумай еще!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
