package estructura_de_datos;

import java.util.Scanner;

public interface IArregloPersona {
    void llenarArreglo(Persona persona[], Scanner consola);
    void mostrarArreglo(Persona persona[]);
    void buscar(Persona persona[]);
}
