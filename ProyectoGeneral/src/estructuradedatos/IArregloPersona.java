package estructuradedatos;

import java.util.Scanner;

public interface IArregloPersona {
    
    void llenarArreglo(Persona personas[], Scanner entrada);
    void mostrarArreglo(Persona personas[]);
    void buscarNombre(Persona personas[], Scanner entrada);
    void buscarCedula(Persona personas[], Scanner entrada);
 
}
