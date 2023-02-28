package POO.Guiao3;
import java.util.Scanner;
import java.lang.Math;

public class Circulo{

    private double x;
    private double y;
    private double raio;


    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    public Circulo(int cx, int cy, int r){
        this.x = cx;
        this.y = cy;
        this.raio = r;
    }

    public Circulo(Circulo newCirculo){
        this.x = newCirculo.getX();
        this.y = newCirculo.getY();
        this.raio = newCirculo.getR();
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getR(){
        return this.raio;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public void setY(double newY){
        this.y = newY;
    }

    public void setR(double newR){
        this.raio = newR;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if((o == null) || (this.getClass () != o.getClass())) return false;
        Circulo c = (Circulo) o;
        return (this.x == c.getX() && this.y == c.getY() && this.raio == c.getR());
    }

    public String toString(){
        return "Cx = "+this.x+" - Cy = "+this.y+" - Raio = "+this.raio;
    }

    public Circulo clone(){
        return new Circulo(this);
    }

    public void alteraCentro(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double areaCirculo(){
        return Math.PI*this.raio*this.raio;
    }

    public double perimCirculo(){
        return 2*Math.PI*this.raio;
    }

    public static void main(String [] argv){

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(1,1,2);
        Circulo c3 = new Circulo(2,5,3);

        double area = c2.areaCirculo();
        System.out.println("A area do circulo 2 é: "+area);
        
        double perim = c3.perimCirculo();
        System.out.println("O perimetro do circulo 3 é: "+perim);

    }


}
    

