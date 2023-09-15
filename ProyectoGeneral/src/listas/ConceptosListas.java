import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ConceptosListas{
    // en los parentesis angulares va el tipo de dato

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Luis");
        listaNombres.add("Homero");
        listaNombres.add("Carlos");
        listaNombres.add("Pedro");
        listaNombres.add("Jose");
        listaNombres.add("Ramiro");
        

        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println("#" + i + " " + listaNombres.get(i));
        }


        System.out.println("Ingrese el indice y el nombre de la persona que sea cambiar");
        int indice = Integer.parseInt(entrada.nextLine());
        String nombre = entrada.nextLine();

        System.out.println("Nombre antes de actualizar del nombre #0 " + listaNombres.get(0));

        listaNombres.set(indice, nombre);

        System.out.println("Nombre antes de actualizar del nombre #0 " + listaNombres.get(0));
        

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Ingrese un nombre");
        //     listaNombres.add(entrada.nextLine());
        // }
        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println("#" + i + " " + listaNombres.get(i));
        }
        
        int tamanio = listaNombres.size();
        System.out.println("El tamaño de la lista es " + tamanio);

        listaNombres.remove(0);

        tamanio = listaNombres.size();
        System.out.println("El tamaño de la lista es " + tamanio);

        listaNombres.clear();
        tamanio = listaNombres.size();

        System.out.println("El tamaño es " + tamanio);

        
    }
}