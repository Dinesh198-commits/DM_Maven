package polymorphism.overloading;

public class ConstructorOverloading {

    ConstructorOverloading(){
        System.out.println("Hello");
    }
    ConstructorOverloading(int b){
        System.out.println("Hello" +b);
    }

    public static void main(String args[]){

        ConstructorOverloading s1= new ConstructorOverloading();
        ConstructorOverloading s2= new ConstructorOverloading(10);


    }
}
