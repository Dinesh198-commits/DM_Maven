package programmingThink;

import org.apache.commons.math3.analysis.function.Power;
import org.testng.annotations.Test;

public class BestProgramming {

    @Test
    public void t1() {
    double Number = 345,originalNumber, remainder, result = 0;
    originalNumber = Number;
    while(originalNumber!=0){
        remainder = originalNumber%10;
        result = result + (Math.pow(remainder,3));
        originalNumber = originalNumber/10;
    }
    if(Number==result){
        System.out.println("Aramstrong");
    }
    else
        System.out.println(Number + " is not an Armstrong number.");
    }
    @Test
    public void t2() {
        int number = 14;

        if(number % 10 == 7 || number % 7 == 0){

            System.out.println("Buz number");
        }
        else{
            System.out.println("Not a buzz number");
        }


    }

    @Test
    public void t3() {
        int product = 1, sum = 0, ld;
        int number = 34;
        while(number>0){
            ld = number%10;
            sum = sum + ld ;
            product = product *ld;
            number = number/10;

        }
        if (sum == product)
            System.out.println(
                    "Given number is spy number");
        else
            System.out.println(
                    "Given number is not spy number");

}
}
