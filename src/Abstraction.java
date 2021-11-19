import java.util.Scanner;

public class Abstraction {

    public static void main(String [] args) {


        Scanner sc = new Scanner(System.in);

        Shape array[] = new Shape[5];


        array[0] = new Rectangle(sc.nextInt(), sc.nextInt());
        array[1] = new Cube(sc.nextInt(),sc.nextInt(), sc.nextInt());
        array[2] = new Sphere(sc.nextInt());
        array[3] = new Triangle(sc.nextInt(), sc.nextInt());
        array[4] = new Rectangle(sc.nextInt(), sc.nextInt());
        for(int i=0;i<5;i++){
            if(array[i] instanceof Checker){
                System.out.println("Volume of  "+array[i].getClass().toString()+" is : "+array[i].volume());
                System.out.println("Area of   "+array[i].getClass().toString()+" is : "+array[i].area());
            }
            else{
                System.out.println("Area of   "+array[i].getClass().toString()+" is : "+array[i].area());
            }
    }



    }
}
 interface Checker{


}



abstract  class Shape{
    abstract public double area();
    abstract public double volume();
    final float pi=3.14f;
}

class Cube extends  Shape implements Checker{
    int l,b,h;
    Cube(int l,int b,int h){
      this.h=h;
      this.b=b;
      this.l=l;
    }
    public double area(){
        return 2*(h*b+b*l+l*h);
    }
    public double  volume(){
        return l*b*h;
    }
}
class Rectangle extends  Shape{

    int l,b;
    Rectangle(int l,int b){

        this.b=b;
        this.l=l;
    }
    public double  area(){
return l*b;
    }
    public double  volume(){
return -1;
    }
}
class Triangle extends  Shape {
    int b,h;
    Triangle(int b,int h){

        this.b=b;
        this.h=h;
    }
    public double  area(){
return 0.5*b*h;
    }
    public double  volume(){
return -1;
    }
}
class Sphere extends  Shape implements Checker{
    int r;
    Sphere(int r){

        this.r=r;

    }
    public double  area(){
return 4*pi*r*r;
    }
    public double  volume(){
return 4*pi*r*r*r/3;
    }
}