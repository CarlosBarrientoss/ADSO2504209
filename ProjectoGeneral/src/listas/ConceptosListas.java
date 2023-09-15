package listas;

import java.util.ArrayList;
import java.util.List;

public class ConceptosListas{
    public static void main(String[] args) {
        
        List<String> listaNombres = new ArrayList<>();

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(5);
        listaNumeros.add(1);
        var tamanioNum = listaNumeros.size();
        System.out.println("El tamaño de la lista de numeros es de; " + tamanioNum);

        System.out.println("nombre antiguo: "+ listaNombres.get(2));
        



        listaNombres.add("Carlos");
        listaNombres.add("Gabriel");
        listaNombres.add("Camilo");

        var tamanio = listaNombres.size();
        System.out.println(tamanio);
        
        System.out.println("nombre antiguo: "+ listaNombres.get(2));
        listaNombres.set(2, "Juan");
        listaNombres.get(2);
        System.out.println("El nombre nuevo: "+ listaNombres.get(2));

        listaNombres.clear();
        tamanio = listaNombres.size();
        System.out.println(tamanio);
        // listaNumeros.forEach(nombres ->{
        //     System.out.println(nombres);
        // });
        // listaNombres.forEach(System.out::println);

        




    }
}