package eatonInterview;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayBasic {
    public int [] Numbers  = {4,6,2,8,9,2};
    @Test
    public void arrayIterate(){
        for(int i=0;i<Numbers.length; i++){
            System.out.println(Numbers[i]);
        }
        HashSet<Integer> Hset = new HashSet<>();
        for(int i=0;i<Numbers.length; i++){

           Hset.add(Numbers[i]);
        }
        System.out.println(Hset);
    }
    @Test
    public void arraySort(){
        Arrays.sort(Numbers);
        for(int i=0;i<Numbers.length; i++){
            //System.out.println(Numbers[i]);
        }
        System.out.println("Max" + Numbers[Numbers.length-1]);
        System.out.println("Min" +Numbers[0]);
    }
    @Test
    public void arrayMaximium(){
        int Max = Numbers[0];
        for(int i=0;i<Numbers.length; i++){
            if(Numbers[i]>Max){
                Max =Numbers[i];
            }
        }
        System.out.println(Max);
    }
    @Test
    public void arrayMinimium(){
        int Min = Numbers[0];
        for(int i=0;i<Numbers.length; i++){
            if(Numbers[i]<Min){
                Min =Numbers[i];
            }
        }
        System.out.println(Min);
    }
    @Test
    public void arraySort1(){
        int temp;
        for(int i=0;i<Numbers.length; i++){
            for(int j=i+1;j<Numbers.length; j++){
                if(Numbers[i]>Numbers[j]){
                temp = Numbers[i];
                Numbers[i] = Numbers[j];
                Numbers[j] = temp;}}
            }
            for(int i=0;i<Numbers.length; i++){
                System.out.println(Numbers[i]);
            }
        }
    @Test
    public void arraySecondMaximium(){
        int Max = Numbers[0];
        int SecondMax = 0;
        for(int i=0;i<Numbers.length; i++){
            if(Numbers[i]>Max){
                SecondMax = Max;
                Max =Numbers[i];
            } else if (Numbers[i]>SecondMax) {
                SecondMax = (Numbers[i]);
            }
        }
        System.out.println(Max);
        System.out.println(SecondMax);
    }

    @Test
    public void arrayReverse() {
        int Number1[] = new int[Numbers.length];
        int j = Numbers.length;
        for (int i = 0; i < Numbers.length; i++) {
            Number1[j - 1] = Numbers[i];
            j = j - 1;
        }
        for (int k = 0; k < Number1.length; k++) {

            System.out.println(Number1[k]);
        }
    }
    @Test
    public void arrayReverseWithout() {
        int temp;
        int j = Numbers.length-1;
        for (int i = 0; i < Numbers.length/2; i++) {
            temp = Numbers[i];
            Numbers[i] = Numbers[j];
            Numbers[j] = temp;
            j--;
        }

        System.out.println(Arrays.toString(Numbers));
    }

}
