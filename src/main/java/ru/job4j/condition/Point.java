package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {

        double x = x2 - x1;
        double y = y2 - y1;
        double rsl = -1;
        double first = Math.sqrt(x);
        double second = Math.sqrt(y);
        double a = first + second;
        double notNotFirst = Math.sqrt(a);

        return rsl;
    }

    public static void main(String[]args) {
        double result = Point.distance(0,0,2,0);
      System.out.print("    result (0,0) to (2, 0)  " + result);

   }
}