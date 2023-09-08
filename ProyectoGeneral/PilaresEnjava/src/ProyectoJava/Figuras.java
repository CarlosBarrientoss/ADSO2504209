package ProyectoJava;

public abstract class Figuras {

    protected double base;
    protected double altura;

    public Figuras(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract void hallarArea();
    public abstract void hallarPerimetro();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
