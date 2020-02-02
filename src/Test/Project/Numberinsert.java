package Test.Project;
import java.util.Arrays;
import java.util.Random;
public class Numberinsert {
    public static void main(String[] args) {
        int[] myarray = new int [10];
        Random rand = new Random();
        for (int i = 0; i < myarray.length -1; i++) {
            myarray[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(myarray));
        for (int j = myarray.length - 1; j > 3; j--) {
            myarray[j] = myarray[j-1];
        }
        myarray[3] = 42;
        System.out.println(Arrays.toString(myarray));
    }
}
