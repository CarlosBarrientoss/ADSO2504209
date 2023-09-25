package estructuradedatos;

public class Persona {
    private String nombre;
    private String apellidos;
    private String nickname;
    private int cedula;
    private double sueldo;
    private long celular;
    private char genero;

    public Persona(String nombre,String apellidos,String nickname, int cedula, double sueldo, long celular, char genero){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nickname = nickname;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.celular = celular;
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCedula(){
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public  double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public  long getCelular(){
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public  char getGenero(){
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Persona \n");

        sb.append("Name: ").append(nombre).append('\n');
        sb.append("Surnames: ").append(apellidos).append('\n');
        sb.append("Nickname: ").append(nickname).append('\n');
        sb.append("DNI: ").append(cedula).append('\n');
        sb.append("Salary: ").append(sueldo).append('\n');
        sb.append("Cell Phone: ").append(celular).append('\n');
        sb.append("Gender: ").append(genero).append('\n');

        sb.append(' ');
        return sb.toString();
    }

}
