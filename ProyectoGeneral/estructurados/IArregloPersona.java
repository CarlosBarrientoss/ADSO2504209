package estructurados;

import java.util.Scanner;

public interface IArregloPersona {

    void llenarArreglo(Persona personas[], Scanner consola);
    void mostrarArreglo(Persona personas[]);
    void buscarNombre(Persona personas[]);
    void burcarCedula(Persona persona[]);
}
