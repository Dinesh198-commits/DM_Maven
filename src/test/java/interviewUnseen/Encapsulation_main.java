package interviewUnseen;

public class Encapsulation_main {
    public static void main(String [] args){

        Encapsulation_base Ba = new Encapsulation_base();
        Ba.setName("Rohit");
        Ba.setAge(45);
        System.out.println(Ba.getName() +" And " +Ba.getAge());

    }
}
