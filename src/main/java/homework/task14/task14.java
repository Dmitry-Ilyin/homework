package homework.task14;

import java.util.Arrays;

public class task14 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
        }
        System.out.println("Макисмальное число: " + Arrays.stream(array).max().orElseThrow(Exception::new));
        System.out.println("Минимальное число: " + Arrays.stream(array).min().orElseThrow(Exception::new));
        System.out.println("Макисмальное число по модулю: " + Arrays.stream(array).map(Math::abs).max().orElseThrow(Exception::new));
        System.out.println("Минимальное число по модулю: " + Arrays.stream(array).map(Math::abs).min().orElseThrow(Exception::new));
    }
}

//Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
//1. Выведите максимальный и минимальный элемент массива.
//2. Из максимального и минимального значения выведите наибольшее по модулю.
