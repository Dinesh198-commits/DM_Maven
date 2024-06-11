import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static testcases.BaseClass.driver;

public class InterviewExam {


    @Test

    public void test(){



        int [] arr1 = {56, 73, 56, 91, 5, 6, 76, 73};
        int temp;

        for(int i=0;i<arr1.length;i++){

            for(int j=i+1;j<arr1.length;j++){

                if(arr1[i]>arr1[j]){
                    temp = arr1[i];
                    arr1[i] =arr1[j];
                    arr1[j] = temp;

                }
            }
        }

        System.out.println("Second largest number is " + arr1[arr1.length-2]);
        TakesScreenshot ts = (TakesScreenshot) driver;


    }

    public static void main (String [] args){
        System.out.println("hello");
        System.err.println("hello");
        System.out.printf("hello");


    }
}
