package JavaCourses.String;

public class RegexHomeTask {
    public static void main(String[] args) {
        String format =  "anytext %d anytext %d, %d, %d";
        printf(format, 12, 13,2.3,4.3 );
        System.out.println(format);
        System.out.printf(format, 12, 23, 34, 33);

    }
    private static void printf(String format, int value, int value2, double value3, double value4){
        format =  "anytext %v anytext %v, %v, %v";
        String strValue = String.valueOf(value);
        format.replace("%v", strValue);

    }
}
