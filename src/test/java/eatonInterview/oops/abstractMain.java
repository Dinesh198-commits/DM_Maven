package eatonInterview.oops;

public class abstractMain extends abstractBase{

    public void display(){

        System.out.println("I am football player");
    }

    public static void main(String args[]){

        abstractMain ab = new abstractMain();
        ab.display();
        ab.name();

    }
}
