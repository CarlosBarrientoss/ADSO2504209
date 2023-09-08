package estructuradedatos;

import java.util.Scanner;

public interface IArregloPersona {
    
    void llenarArreglo(Persona[] personas, Scanner scanner);
    void mostrarArreglo(Persona personas[]);
    void buscarNombre(Persona[] personas, Scanner scanner);
    void buscarCedula(Persona[] personas, Scanner scanner);
}
