import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Ingrese el tamaño de la lista");

        int tamanio = Integer.parseInt(entrada.nextLine());
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el numero #" + i);
            int numero = Integer.parseInt(entrada.nextLine());
            listaNumeros.add(i, numero);
        }




        boolean  start = true;
        
        while (start){

        System.out.println("Seleccione una opcion");
        System.out.println("1) Eliminar");
        System.out.println("2) Actualizar");
        System.out.println("3) Añadir");
        System.out.println("4) Mostrar");

        int opcion = Integer.parseInt(entrada.nextLine());
        
        if (opcion == 1){
            System.out.println("Ingrese el indice del numero que desea eliminar");
            int indice = Integer.parseInt(entrada.nextLine());
            System.out.println("Antes");
            System.out.println(listaNumeros.get(indice));
            System.out.println("Despues");
            listaNumeros.remove(indice);
            System.out.println(listaNumeros.get(indice));

        }
        else if (opcion == 2){
            System.out.println("Ingrese el indice del numero que desea actualizar");
            int indice = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese el nuevo valor");
            int n = Integer.parseInt(entrada.nextLine());
            System.out.println("Antes");
            System.out.println(listaNumeros.get(indice));
            System.out.println("Despues");
            listaNumeros.set(indice, n);
            System.out.println(listaNumeros.get(indice));

        }

        else if (opcion == 3){
            System.out.println("Ingrese el nuevo valor");
            int n = Integer.parseInt(entrada.nextLine());
            listaNumeros.add(n);
        }

        else if (opcion == 4){
            listaNumeros.forEach(numero -> {System.out.println(numero);});
        System.out.println("El tamaño de la lista es " + listaNumeros.size());
        }

        else if (opcion == 5){
            System.out.println("Saliendo del sistema");
            start = false;
        }
        }
    }
    
    
}
