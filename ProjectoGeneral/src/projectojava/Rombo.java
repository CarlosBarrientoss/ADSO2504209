package projectojava;
public class Rombo implements IFigura{
    private double diagonalMa;
    private double diagonalMe;
    private double lado1;

    public Rombo(double diagonalMa, double diagonalMe, double lado1) {
        this.diagonalMa = diagonalMa;
        this.diagonalMe = diagonalMe;
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    
    
    
    public double getDiagonalMa() {
        return diagonalMa;
    }

    public void setDiagonalMa(double diagonalMa) {
        this.diagonalMa = diagonalMa;
    }

    public double getDiagonalMe() {
        return diagonalMe;
    }

    public void setDiagonalMe(double diagonalMe) {
        this.diagonalMe = diagonalMe;
    }
    
    public void hallarArea(){
        double area= (diagonalMa*diagonalMe)/2;
        System.out.println("El area del Rombo es de: " + area);
    }
    public void hallarPerimetro(){
        double perimetro = lado1*4;
        System.out.println("El perimetro de un rombo es de: " + perimetro);
    }

}
