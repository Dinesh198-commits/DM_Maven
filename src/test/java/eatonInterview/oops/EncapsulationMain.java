package eatonInterview.oops;

public class EncapsulationMain {

    public static void main(String[] args){

        EncapsulationBase EB = new EncapsulationBase();
        EB.setName("Dinesh");
        EB.setAge(25);
        System.out.println(EB.getName() +" and " +EB.getAge());
    }
}
