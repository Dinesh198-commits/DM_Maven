package interviewUnseen;

public class Polymorphism_Overloading {

    public static int area(int l,int w){
        return l* w;
    }
    public static double area(double l,int w){
        return l* w;
    }
    public static int area(int l,int w,int h){
        return l* w*h;
    }
    public static double area(double l,double w){
        return l* w;
    }
    public static void main(String [] args){
        System.out.println("Square area" +area(3,4));
        System.out.println("triangle area" +area(3,4,9));
    }
}
