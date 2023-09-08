package projectojava;
public class Pentagono {
    
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
    
    
    
    public void hallarPerimetro(){
        double perimetro = lado*5;
        System.out.println("El perimetro del pentagono es de:");
        
        
    }
    public void hallarArea(double perimetro){
        double area = (perimetro*apotema);
        System.out.println("El area de un pentagono es de: " + area);
    }
}
