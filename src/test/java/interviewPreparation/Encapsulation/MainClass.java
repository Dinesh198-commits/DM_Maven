package interviewPreparation.Encapsulation;

public class MainClass {
    public static void main(String args[]){

        BaseClass bs = new BaseClass();
        bs.setname("Rama");
        bs.setage(16);
        System.out.println(bs.getname() +"and"  +bs.getAge());
    }

}
