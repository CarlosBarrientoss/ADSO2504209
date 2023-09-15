package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticaListas2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> enteros = new ArrayList<>();

        boolean estaEjecutando = true;

        while (estaEjecutando) {
            System.out.println("Elija una opcion\n[1] Mostrar elementos en la lista\n[2] Agregar numero\n[3] Eliminar numero\n[4] Modificar numero\n[5] salir del bucle");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    mostrarNumeros(enteros);
                    break;
                case 2:
                    agregarNumero(enteros, scanner);
                    break;
                case 3:
                    eliminarNumero(enteros, scanner);
                    break;
                case 4:
                    actualizarNumero(enteros, scanner);
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema");
                    estaEjecutando = false;
                    break;
            
                default:
                System.out.println("Opcion elegida no valida");
                    break;
            }
        }
    }

    static void agregarNumero(List<Integer> numeros, Scanner scanner) {
        System.out.println("----------------------------------------------");
        System.out.print("Ingrese un numero entero: ");
        numeros.add(Integer.parseInt(scanner.nextLine()));
        System.out.println("Numero agregado\n");
        System.out.println("----------------------------------------------");
    }
    static void mostrarNumeros(List<Integer> numeros) {
        System.out.println("----------------------------------------------");
        System.out.println("La lista contiene " + numeros.size() + " elementos");
        System.out.println("El contenido de la lista es: ");
        // numeros.forEach(valor -> {System.out.println(valor);});  // metodo 1
        numeros.forEach(System.out::println);  // metodo 2
        System.out.println();
        System.out.println("----------------------------------------------");
    }
    static void eliminarNumero(List<Integer> numeros, Scanner scanner) {
        System.out.println("----------------------------------------------");
        System.out.print("Ingrese la posicion del numero a remover: ");
        numeros.remove(Integer.parseInt(scanner.nextLine()));
        System.out.println("Numero eliminado\n");
        System.out.println("----------------------------------------------");
    }
    static void actualizarNumero(List<Integer> numeros, Scanner scanner) {
        System.out.println("----------------------------------------------");
        System.out.print("Ingrese la posicion del numero a actualizar: ");
        int pos = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el nuevo numero: ");
        int num = Integer.parseInt(scanner.nextLine());

        numeros.set(pos, num);
        System.out.println("Numero actualizado\n");
        System.out.println("----------------------------------------------");
    }
}
