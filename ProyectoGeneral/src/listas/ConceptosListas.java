package listas;

import java.util.ArrayList;
import java.util.List;

public class ConceptosListas {
    
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Alex");
        nombres.add("Max");
        nombres.add("Gustavo");
        nombres.add("Umi");
        nombres.add("Utau");
        nombres.add("Hikari");

        int tamanio = nombres.size();

        System.out.println("El tamano de la lista es de: " + tamanio);

        System.out.println("Nombre en la posicion 5 antes de actualizar: " + nombres.get(5));
        nombres.set(5, "Keitaro");
        System.out.println("Nombre en la posicion 5 despues de actualizar: " + nombres.get(5));

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        nombres.remove(0);
        nombres.remove("Gustavo");

        tamanio = nombres.size();
        System.out.println("El tamano de la lista es de: " + tamanio);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        nombres.clear();
        tamanio = nombres.size();
        System.out.println("El tamano de la lista es de: " + tamanio);
    }
}
