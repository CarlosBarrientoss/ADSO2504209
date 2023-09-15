package Listas;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
    
    public static void main(String[] args) {
        
        List<Integer> listNumeros = new ArrayList<>();
        
        listNumeros.add(15);        
        listNumeros.add(24);
        listNumeros.add(58);    
        listNumeros.add(72);   
        listNumeros.add(69);   
        listNumeros.add(99);   
    
        var longitud = listNumeros.size();
        
        System.out.println("La longitud de los numeros es: " + longitud);

        System.out.println("Actualizaremos el siguiente numero: " +listNumeros.get(4) );
    
        listNumeros.set(4, 123);

        System.out.println("El numero que quedo despues de haber sido actualizado: " + listNumeros.get(4));

        listNumeros.clear();
            longitud = listNumeros.size();
            System.out.println("La longitud es: " + longitud);
        

    }
}
