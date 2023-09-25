package listas;

import java.util.ArrayList;
import java.util.List;

public class ConceptoListas {

    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Joshua");
        listaNombres.add("Jose");
        listaNombres.add("Brayan");
        listaNombres.add("Jesus");
        listaNombres.add("Ediver");
        listaNombres.add("Messi");

        var tamano = listaNombres.size();
        System.out.println("tamaño = " + tamano);

        listaNombres.forEach(valor -> {
            System.out.println(valor);
        });

        System.out.println("Nombre antes de actualizar " + listaNombres.get(5));
        listaNombres.set(5,"Jhon");
        System.out.println("Nombre despues de actualizar " + listaNombres.get(5));

        //listaNombres.clear();
        tamano = listaNombres.size();
        System.out.println("tamano = " + tamano);

        listaNombres.forEach(System.out::println);


        /*listaNombres.remove(1);
        tamano = listaNombres.size();
        System.out.println("tamano = " + tamano);*/


    }
}
