package sena.jonathan_avendano.Listas;

import java.util.ArrayList;
import java.util.List;

public class ConceptosListas {
    public static void main(String[] args) {
        List <String> listaNombres = new ArrayList<>();
        listaNombres.add("Tatan");
        listaNombres.add("Jonathan");
        listaNombres.add("Garrapata");

        listaNombres.forEach(System.out::println);
        
        var tamanio = listaNombres.size();
        System.out.println("tamanio = " + tamanio);

        System.out.println("Nombre antes de actualizar = " + listaNombres);
        listaNombres.set(2, "Sapoperro");
        System.out.println("Nombre despues de actualizar = " + listaNombres);

        listaNombres.clear();
        tamanio = listaNombres.size();
        System.out.println(tamanio);

       // List<String> listaNombresDos = new ArrayList<>();
        //listaNombresDos.add("Daniela");
        //listaNombresDos.add("Pan");
        //listaNombresDos.add("Queso");
        //listaNombresDos.add("Panela");
        //listaNombresDos.add("Patacon");
        
        //Ver tamaño
        //var tamanio = listaNombresDos.size();
        //System.out.println("tamanio = " + tamanio);

        //Antes y despues de actualizar
        //System.out.println("Antes de actualizar = " + listaNombresDos);
        //listaNombresDos.set(3, "Mermelada");
        //System.out.println("Despues de actualizar = " + listaNombresDos);

        //Eliminar
        //listaNombresDos.clear();
        //tamanio = listaNombresDos.size();
        //System.out.println(tamanio);



    }
    
}
