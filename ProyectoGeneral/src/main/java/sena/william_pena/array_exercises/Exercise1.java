package sena.william_pena.array_exercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise1 {

    public static void main(String... args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(23);
        array.add(4);
        array.add(96);
        array.add(5);

        System.out.println(String.format("Las siguientes son las conclusiones del arreglo: %s \n", array.toString()));
        System.out.println(String.format("El numero mayor es: %d", getMax(array)));
        System.out.println(String.format("El numero menor es: %d", getMin(array)));

    }

    public static int getMax(ArrayList<Integer> arr) {
        int max = Collections.max(arr);
        return max;
    }

    public static int getMin(ArrayList<Integer> arr) {
        int min = Collections.min(arr);
        return min;
    }
}
