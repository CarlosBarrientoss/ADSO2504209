package proyectoJava;

public abstract class FigurasGeometricas {

    protected double base;
    protected double altura;

    public FigurasGeometricas(){

    }

    public FigurasGeometricas( double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public FigurasGeometricas( double base){
        this.base = base;
    }
    abstract double hallarArea();

    abstract double hallarPerimetro();


}
