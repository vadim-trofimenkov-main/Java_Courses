package JavaCourses;

public class Summ {
    public static void main(String[] args) {
        int i = 0;
        int summ = 0;
        while (i <= 31) {
            if (i%2 == 0) {
                summ += i;
            }
            i++;
        }
        System.out.println("Сумма четных чисел от 0 до 31 равна:" +summ);
    }
}
