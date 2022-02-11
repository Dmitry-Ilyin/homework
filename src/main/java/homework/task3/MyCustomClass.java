package homework.task3;

public class MyCustomClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int arraySize = array.length - 1;
        int i = array[0];
        array[0] = array[arraySize];
        array[arraySize] = i;
        System.out.println(array[0] + array[arraySize/2]);
    }
}