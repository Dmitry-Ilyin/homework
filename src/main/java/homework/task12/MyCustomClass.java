package homework.task12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        String str = null;
        String strToUpperCase = null;
        boolean contains;
        boolean startsWith;
        boolean endWith;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Введите в консоль 'I like Java!!!'");
                str = reader.readLine();
                contains = str.contains("Java");
                startsWith = str.startsWith("I like");
                endWith = str.endsWith("!!!");
                if (contains && startsWith && endWith) {
                    strToUpperCase = str;
                    System.out.println(strToUpperCase.toUpperCase());
                    str = str.replaceAll("a", "o");
                    System.out.println(str.substring(str.length() - 7, str.length() - 3));
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
