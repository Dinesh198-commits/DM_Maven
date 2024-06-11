package programmingThink.oops;

public class ParentClass extends ChildClass {

    public int sum(int a,int b){

        return  a + b;
    }

    public static void main(String[] args){

        ChildClass cs = new ParentClass();
        System.out.println(cs.sum(5,6));
    }
}
