package estructura_de_datos;

import java.util.Scanner;

public interface IArregloPersona {
    void llenarArreglo(Persona persona[], Scanner consola);
    void mostrarArreglo(Persona persona[]);
    void buscarNombre(Persona persona[]);
    void buscarCedula(Persona persona[]);
    //void nombreValido(Persona persona[]);
    //void cedulaValido(Persona persona[]);
}
