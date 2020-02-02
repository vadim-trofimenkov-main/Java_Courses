package Test.Project;

public class Test_Daria {
    public static void main(String[] args) {
        int a=7;
        int b=9;
        int c = a + b;
        if( c > 15) {
            for ( int i = 0; i < 10; i++) {
                c++;
                System.out.println(c);
            }
        } else{
            System.out.println("Error: c должно быть больше 15");
        }
    }
 }
