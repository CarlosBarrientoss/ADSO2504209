package sena.william_pena.array_exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String... args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(23);
        array.add(4);
        array.add(96);
        array.add(5);

        System.out.println(String.format("Array: %s", array.toString()));
        System.out.println(String.format("El promedio de los valores del array es: %.1f", getAverage(array)));
    }

    public static double getAverage(ArrayList<Integer> arr) {
        double average = 0;

        for (Integer number : arr) {
            average += number;
        }

        average /= arr.size();
        return average;
    }
}
