package eatonInterview.oops;

import org.testng.annotations.Test;

public class JavaVariables {
    //define in class but outside method
    int number = 10;
    protected static int number1 = 16;
    public static void main(String[] args){
        JavaVariables jb = new JavaVariables();
        int number = 15;
        number = jb.number;
        System.out.println(jb.number);
        System.out.println(number);
        System.out.println(number1);

    }
}
