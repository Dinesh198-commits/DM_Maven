package polymorphism.overloading;

public class MethodOverloading {

    public int add(int a,int b){
        return  a + b;
    }

    public double add(int a,double b){
        return  a + b;
    }

    public double add(int a,double b,int c){
        return  a + b;
    }

    public static void main(String args[]){
        MethodOverloading  oo = new MethodOverloading();
        System.out.println(oo.add(50,56));
        System.out.println(oo.add(50,56.5));
        System.out.println(oo.add(50,56.5,34));
    }
}
