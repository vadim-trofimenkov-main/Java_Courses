package JavaCourses.String;

public class Task {
    public static void main(String[] args) {
        String str = "01.12.2022";
        String day = str.substring(0,2);
        String month = str.substring(3,5);
        String year = str.substring(6);
        int day1 = Integer.parseInt(day);
        int month1 = Integer.parseInt(month);
        int year1 = Integer.parseInt(year);
        System.out.println("Строка: " + str);
        System.out.println("Day: " + day1);
        System.out.println("Month: " +month1);
        System.out.println("Year: " +year1);
    }
}
