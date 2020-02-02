package Test.Project.Test;
public class Arrays {
    public static void main (String[] args) {
        int[] numbers = {10,2,15,40,500};
        int summ = 0;
        int n = numbers.length;
        int MinValue = numbers[0];
        int MinIndex = 0;
        for (int i=1; i<numbers.length; i++) {
        if ( numbers[i] < MinValue ) {
            MinValue = numbers[i];
            MinIndex = i;
        }
        }
        int Maxvalue = numbers[0];
        int MaxIndex = 0;
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > Maxvalue) {
                Maxvalue = numbers[i];
                MaxIndex = i;
            }
        }
        for (int i=0; i<numbers.length; i++) {
            summ = summ + numbers[i];
            System.out.println(numbers[i]);
        }
        int aver = summ / numbers.length;
        System.out.println();
        System.out.println("Сумма Массива numbers равна " + summ);
        System.out.println("Среднее значение массива numbers равна " + aver);
        System.out.println("Количество элементов Массива numbers равно " + n);
        System.out.println("Еще один вариант вывода длины массива: " + numbers.length);
        System.out.println("Наименьшее значение массива: " + MinValue);
        System.out.println("Индекс наименьшего элемента: " + MinIndex);
        System.out.println("Наибольшее значение массива: " + Maxvalue);
        System.out.println("Индекс наибольшего элемента: " + MaxIndex);
    }
}
