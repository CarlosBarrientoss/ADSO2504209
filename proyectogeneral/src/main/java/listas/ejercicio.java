
package listas;

import java.util.ArrayList;
import java.util.List;

public class ejercicio {
    public static void main(String[] args) {
        List<Integer>listaNumero= new ArrayList();
        listaNumero.add(1);
        listaNumero.add(2);
        listaNumero.add(3);
        listaNumero.add(4);
        
        int tamanio=listaNumero.size();
        System.out.println("tamaño = " + tamanio);
        
        listaNumero.remove(0);
        tamanio=listaNumero.size();
        System.out.println("tamaño nuevo = " + tamanio);
        
        System.out.println("numero antes de actualizarse= "+ listaNumero.get(2));
        listaNumero.set(2, 22);
        System.out.println("numero despues de actualizarse= "+ listaNumero.get(2));
        
        listaNumero.clear();
        tamanio=listaNumero.size();
        System.out.println(+tamanio);
        
        
        
        
        

    }
}
