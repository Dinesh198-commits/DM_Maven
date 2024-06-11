package programmingThink;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Array_Play {

    @Test
    public void t1() {
        int [] number  = {5,4,3,7,1,9};
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
    @Test
    public void t2() {
        int [] number  = {5,4,3,7,1,9};
        int Min = 0;
        int Max = number[0];
        for(int i=0;i<number.length;i++){
                if(Max<number[i]){
                    Max =  number [i];
                }
            }
        System.out.println(Min +"And" +Max);
    }
    @Test
    public void t3() {
        int [] number  = {5,4,3,7,1,9};
        Arrays.sort(number);
        for(int i=0;i<number.length;i++){
        System.out.println(number[i]);}}

    @Test
    public void t4() {
        int n = 10;
        int i;
        int [] a = new int[20];
        a[0] = 0;
        a[1] = 1;
        for(i=2;i<a.length;i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    @Test
    public void t5() {
        int i,j,sum;
        sum = 0;
        int [] [] number  = {{5,4,3},{7,1,9}};

        for(i=0;i<2;i++){
            for(j=0;j<2;j++){

                sum += number[i][j];
            }
        }
        System.out.println(sum);
    }
}
