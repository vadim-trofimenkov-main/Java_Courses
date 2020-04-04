package com.javacourses.lesson_practice.OOP.Person;

public class MainPoint {
    public static void main(String[] args) {
Point point1 = new Point( 5, 3);
Point point2 = new Point();
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(getDistance(point1, point2));
    }
    public static double getDistance(Point p1, Point p2){
        int x1 = p1.getX();
        int x2 = p2.getX();
        int y1 = p1.getY();
        int y2 = p2.getY();
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return distance;
    }
}


