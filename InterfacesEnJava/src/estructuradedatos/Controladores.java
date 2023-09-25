package estructuradedatos;

import java.util.Scanner;
public class Controladores implements IArregloPersona {

    //Metodo para validar el nombre
    public static boolean nombreValido (String nombre){
        return nombre.matches("^[a-zA-Z\\s]+$");
    }

    public static boolean cedulaValido (String cedula){
        return cedula.matches("\\d+");
    }
        @Override
        public void llenarArreglo(Persona personas[], Scanner sc) {

            //Llenar arreglo de objetos
            for (int i = 0; i < personas.length; i++) {

                //Valdacion del nombre
                System.out.println("Ingrese el nombre de la persona: " + (i + 1) + ":");
                String nombre = sc.nextLine();

                while (!nombreValido(nombre)){
                    System.out.println("Nombre no valido. Ingrese un nombre valido");
                    nombre = sc.nextLine();
                }

                System.out.println("Ingrese los apellidos de: " + nombre);
                String apellidos = sc.nextLine();

                System.out.println("Ingrese la cedula de: " + nombre);
                String cedulaPorValidar = sc.nextLine();

                //Validar que la cedula ingresada sea un numero valido
                while (!cedulaValido(cedulaPorValidar)){
                    System.out.println("Cedula no valida. Ingrese una cedula valida");
                    cedulaPorValidar = sc.nextLine();
                }

                int cedula = Integer.parseInt(cedulaPorValidar);

                System.out.println("Ingrese el apodo de: " + nombre + " " + apellidos);
                String nickname = sc.nextLine();

                System.out.println("Ingrese el sueldo de: " + nombre + " " + apellidos);
                double sueldo = sc.nextDouble();

                System.out.println("Ingrese el celular de: " + nombre + " " + apellidos);
                long celular = sc.nextLong();

                sc.nextLine();

                System.out.println("Ingrese su genero masculino 'M' o femenino 'F': " + nombre + " " + apellidos);
                char genero = sc.nextLine().charAt(0);

                personas [i] = new Persona(nombre, apellidos,nickname, cedula, sueldo, celular, genero);

            }
        }

        @Override
        public void mostrarArreglo(Persona personas[]) {

            //Mostrar arreglo de objeto
            for (Persona nombre : personas) {
                System.out.println(nombre);

            }
        }

    @Override
    public void buscarNombre(Persona[] personas) {
        for (Persona nombre : personas) {
            if (nombre.getNombre().equals("Joshua")){
                System.out.println("Nombre encontrado en el vector");
            }
        }
    }

    @Override
    public void buscarCedula(Persona[] personas) {
        for (Persona cedula: personas){
            if (cedula.getCedula() == 1044608003){
                System.out.println("Cedula encontrada en el vector");
            }
        }
    }
}


