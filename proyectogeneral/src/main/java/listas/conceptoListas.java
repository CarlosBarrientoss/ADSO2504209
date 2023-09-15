package listas;

import java.util.ArrayList;
import java.util.List;
      
public class conceptoListas {
    public static void main(String[] args) {
        List<String> listasNombres= new ArrayList<>();
        listasNombres.add("paco");
        listasNombres.add("santorini");
        listasNombres.add("eduard");
        listasNombres.add("maria");
        listasNombres.add("camila");
        listasNombres.add("valentina");
        
        
        
        listasNombres.forEach(nombre-> {
                System.out.println(nombre);
                 });
        System.out.println("     ");
        listasNombres.forEach(System.out::println);
        
        
//        int tamanio= listasNombres.size();
//        System.out.println(+ tamanio);
//        
//        System.out.println("nombre antes de actualizar= "+ listasNombres.get(5));
//        listasNombres.set(5, "moises");
//        System.out.println("nombre despues de actualizar= "+ listasNombres.get(5));
//        
//        
//        listasNombres.clear();
//        tamanio= listasNombres.size();
//        System.out.println("tamanio = " + tamanio);
//        
        
        
        
//        listasNombres.remove(0);
//        tamanio= listasNombres.size();
//        System.out.println(+ tamanio);
//        
//        
    }
}
