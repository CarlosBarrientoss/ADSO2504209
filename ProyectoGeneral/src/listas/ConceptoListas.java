package listas;

import java.util.ArrayList;
import java.util.List;

public class ConceptoListas {

    public static void main(String[] args) {


        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Jose");
        listaNombres.add("Joshua");
        listaNombres.add("David");
        listaNombres.add("Alex");
        listaNombres.add("Victoria");
        listaNombres.add("Mendoza");
        
        var tamanio = listaNombres.size();
        System.out.println("tamaño = " + tamanio);

        listaNombres.forEach(nombre -> {
            System.out.println(nombre);
        });
        
        /*listaNombres.remove(0);
        tamanio = listaNombres.size();
        System.out.println("tamanio = " + tamanio);*/

        /*System.out.println("Nombre antes de actualizar: " + listaNombres.get(5));

        listaNombres.set(5, "Rincon");

        System.out.println("Nombre despues de actualizar: " + listaNombres.get(5));*/

    }
}
