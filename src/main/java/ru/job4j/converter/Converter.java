package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        float rsl = Converter.rubleToDollar(120);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("120 rubles are " + rsl + " dollar");
    }
}