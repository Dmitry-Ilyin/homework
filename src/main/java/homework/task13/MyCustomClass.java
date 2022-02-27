package homework.task13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyCustomClass {
    public static void main(String[] args) {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str = reader.readLine().trim();
            String[] array = str.split("\\s+");
            for (String s : array) {
                if (!s.matches("([а-яА-Я]+)|(.*[0-9].*)"))
                    System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
