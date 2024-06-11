package eatonInterview.oops;

public class MethodOverridingMainRevised extends MethodOverridingBase {

    public  void size(){
        super.size();
        System.out.println("Hi Dinesh is here");
    }

    public static void main(String[] args){
        MethodOverridingBase bn = new MethodOverridingMainRevised();
        bn.size();

    }
}
