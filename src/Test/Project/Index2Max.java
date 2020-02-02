package Test.Project;

public class Index2Max {
    public static void main(String[] args) {
        int [] myarray = { 4, 6, 8, 0, 1, 13 };
        int max = 0;
        for (int i = 0; i < myarray.length ; i++) {
            if ( myarray[i] > myarray[max] && i % 2 == 0) {
                    max = i;
            }
        }
        System.out.println("Индекс максимального элемента равен: " + max);
        System.out.println("Максимальный элемент с четным индексом равен: " + myarray[max]);
    }
}
