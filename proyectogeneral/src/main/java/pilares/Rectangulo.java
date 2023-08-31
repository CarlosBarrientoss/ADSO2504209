
package com.mycompany.pilaresenjavaa;
// primer elemto de la poo
public class Rectangulo implements IFigura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   
    
        //tercer elemetno  de la poo
   
    @Override
    public void hallarArea(){
        
        double area=base*altura;
        System.out.println("area = " + area + " metros");
    }   
        
    public  void hallarPerimetro(){
             double perimetro= (base*2)+(altura*2);
        System.out.println("perimetro = " + perimetro);
    }
    
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    
    
    
    
}
