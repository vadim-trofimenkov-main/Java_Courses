package Test.Project;
import java.util.Arrays;
import java.util.Random;
public class Sorting {
    public static void main(String[] args) {
        int[] myarray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(myarray));
        sorting(myarray);  // объявляем метод sorting в методе main
    }
    private static void sorting(int[] sortedarray) {
        for (int j = 0; j < sortedarray.length; j++) {  // первый for который отвечает за проход по всему массиву и замену чисел
            int indexMin = j; // j ставится для того, чтобы разделить массив на 2 части: отсорт и неотсорт, и начинать каждый новый шаг с первого элемента неотсорт части
            for (int k = j; k < sortedarray.length ; k++) { // вложенный for, находим минимальный элемент в неотсорт части массива
                if (sortedarray[indexMin] > sortedarray[k]) {
                    indexMin = k;
                }
            }
            int temp = sortedarray[j]; // меняем местами минимальный и первый элементы неотсорт части массива
            sortedarray[j] = sortedarray[indexMin];
            sortedarray[indexMin] = temp;
        }
        System.out.println(Arrays.toString(sortedarray));
    }
}