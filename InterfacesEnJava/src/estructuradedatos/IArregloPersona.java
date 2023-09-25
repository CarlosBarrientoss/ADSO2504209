package estructuradedatos;

import java.util.Scanner;

public interface IArregloPersona {

    void llenarArreglo(Persona personas[], Scanner sc);
    void mostrarArreglo(Persona personas[]);
    void buscarNombre(Persona personas[]);
    void buscarCedula(Persona personas[]);


}
