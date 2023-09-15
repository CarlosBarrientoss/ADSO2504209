package Listas;

import java.util.ArrayList;
import java.util.List;

public class ConceptosListas {

    public static void main(String[] args) {
    
     List<String> listaNombre = new ArrayList<>(); 
     
     listaNombre.add("Adolfo Hittler ");
     listaNombre.add("Eduardo");
     listaNombre.add("Vladimir Putin");
     listaNombre.add("Shaira");
     listaNombre.add("Blaek");
     listaNombre.add("Ceferino");
        
        var tamaño = listaNombre.size();
        System.out.println("El tamaño es: " + tamaño);

        System.out.println("El nombre antes de actualizar: " + listaNombre.get(5));
        
        listaNombre.set(5, "Marlon");
        
        System.out.println("El nombre despues de actualizar: " + listaNombre.get(5));

        listaNombre.clear();
            
            tamaño = listaNombre.size();
            System.out.println("El tamaño es: " + tamaño);
        
        // listaNombre.remove(0);
        
        // tamaño = listaNombre.size();
        // System.out.println("El tamaño es: " + tamaño);}
    
    }
}