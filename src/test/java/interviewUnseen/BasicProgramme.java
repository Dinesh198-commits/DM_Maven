package interviewUnseen;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BasicProgramme {
    @Test
    public void leapyear(){
        int year = 2023;
        if(year%4==0 || year%100!=0 && year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    @Test
    public void secondLargest(){
        int [] numbers = {3,5,67,8,1,65};
        int [] newOne = numbers;
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1] +"and" + numbers[numbers.length-2]);
        int Largest = newOne[0];
        int SecondLargest = 0;
        for(int i=0;i<newOne.length;i++){

                if(newOne[i]>Largest){
                    SecondLargest = Largest;
                    Largest = newOne[i];
                }
                if(newOne[i]<Largest){
                    SecondLargest = newOne[i];

            }
            System.out.println(Largest +"and" +SecondLargest);
        }
    }
    @Test
    public void arrayReverse(){
        int [] numbers = {3,5,67,8,1,65};
        int [] revNumbers = new int[numbers.length];
        int j= numbers.length;
        for(int i=0;i<numbers.length;i++){
            revNumbers[j-1] = numbers[i];
            j= j-1;
        }
        for(int i=0;i<revNumbers.length;i++){
            System.out.println(revNumbers[i]);
        }
    }
    @Test
    public void wordCount(){
        String id = "Con gra tu lations";
        String newId = id.replace(" ","");
        System.out.println(newId);
        String [] sp = id.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String word : sp){
            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word,++count);
            }
            else{
                map.put(word,1);
            }
            System.out.println(map);
        }
        for(int i=sp.length-1;i>=0;i--){
            StringBuilder sb = new StringBuilder();
            sb.append(sp[i]);
            System.out.println(sb.reverse());
        }

    }
    @Test
    public void fact(){
        int number = 4;
        int fact = 1;
        for(int i=number;i>1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    @Test
    public void armstrongNumber(){
        int Number = 153;
        int newNumber = Number;
        int Number1 = Number;
        int count =0;
        while(Number!=0){
            Number = Number/10;
            ++count;
            System.out.println(count);
        }
        double num= 0;
        while(newNumber!=0){
           int mod = newNumber%10;
           num = num + (Math.pow(mod,count));
           newNumber = newNumber/10;
        }
        System.out.println(num);
        if(num==Number1){
            System.out.println("a number");
        }

    }
}
