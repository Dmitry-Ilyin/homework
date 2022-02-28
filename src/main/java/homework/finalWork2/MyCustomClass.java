package homework.finalWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) throws IOException {
        System.out.print("Ввод: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] array = str.split("");
        int result;
        if (array[0].equals("x")) {
            result = array[1].equals("+") ? getNumber(array[4]) - getNumber(array[2]) : getNumber(array[4]) + getNumber(array[2]);
        } else if (array[2].equals("x")) {
            result = array[1].equals("+") ? getNumber(array[4]) - getNumber(array[0]) : getNumber(array[0]) - getNumber(array[4]);
        } else {
            result = array[1].equals("+") ? getNumber(array[0]) + getNumber(array[2]) : getNumber(array[0]) - getNumber(array[2]);
        }
        System.out.println("Вывод: " + result);
    }

    private static int getNumber(String number) {
        return Integer.parseInt(number);
    }
}

//Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
//Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
//Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
//Нужно найти неизвестное.
//Пример для теста работы программы:
//- Ввод: x+5=7
//- Вывод: 2
//- Ввод: 3-x=9
//- Вывод: -6
//- Ввод: 3-3=x
//- Вывод: 0
