package estructuradedatos;

import java.util.Scanner;

public interface IArregloPersona {
    
    void llenarArreglo(Persona personas[], Scanner entrada);
    void mostrarArreglo(Persona personas[]);
    void buscar( Persona personas[]);
    void buscarCedula( Persona personas[]);
 
}
