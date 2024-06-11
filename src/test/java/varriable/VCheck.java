package varriable;

import org.testng.annotations.Test;

public class VCheck {
    static int a = 5;
    @Test
    public void test(){

        System.out.println(a);
    }
    @Test
    public void test1(){
        a = 8;
        System.out.println(a);
    }
}
