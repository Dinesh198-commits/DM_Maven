package eatonInterview.oops;

public class MethodOverloadExample {

    public int add(int a,int b){
        return a +b;
    }
    public int add(int a,int b,int c){
        return a +b + c;
    }
    public double add(int a,int b,double c){
        return a +b + c;
    }
    public double add(double a,double b,double c){
        return a +b + c;
    }
    public static void main(String[] args){
        MethodOverloadExample ME = new MethodOverloadExample();
        System.out.println(ME.add(35,67));
        System.out.println(ME.add(35,67,78));
        System.out.println(ME.add(23,56,67.7));
        System.out.println(ME.add(23.2,45.7,67.8));
    }
}
