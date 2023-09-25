import estructuradedatos.Controladores;
import estructuradedatos.Persona;
import java.util.Scanner;

public class ArrayPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int tamano = sc.nextInt();


        Persona personas[] = new Persona[tamano];

        Controladores controlador = new Controladores();
        controlador.llenarArreglo(personas, sc);
        controlador.mostrarArreglo(personas);
        controlador.buscarNombre(personas);
        controlador.buscarCedula(personas);
        sc.close();

    }

}