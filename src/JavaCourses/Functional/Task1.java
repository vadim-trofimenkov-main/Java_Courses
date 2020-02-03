package JavaCourses.Functional;
public class Task1 {
    public static void main(String[] args) {
        char a = 'a';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';
        int aint = a;
        int zint = z;
        int Aint = A;
        int Zint = Z;
        int b = a - z;
        int c = A - a;
        System.out.println("кодировка символа а - " + aint);
        System.out.println("кодировка символа z - " + zint);
        System.out.println("кодировка символа A - " + Aint);
        System.out.println("кодировка символа Z - " + Zint);
        System.out.println("расстояние между a и z - " + b);
        System.out.println("расстояние между A и a - " + c);
    }
}
