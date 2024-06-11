package eatonInterview;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

@Test
public class BasicProgramme {
    public String Name = "Rajesh Kumar";
    public int digit = 5;

    public void reverseStringFirst() {
        //Name = Name.replaceAll("\\s","");
        String reverse = " ";
        for (int i = Name.length() - 1; i > 0; i--) {
            reverse = reverse + Name.charAt(i);
        }
        System.out.println(reverse);
    }

    public void reverseStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append(Name);
        System.out.println(sb.reverse());
    }

    public void reverseSplit() {
        String[] reverse = Name.split("");
        for (int i = reverse.length - 1; i > 0; i--) {
            System.out.println(reverse[i]);
        }
    }

    public void numberReverse() {
        int Reverse = 0;
        while (digit != 0) {
            Reverse = Reverse * 10 + digit % 10;
            digit = digit / 10;
        }
        System.out.println(Reverse);
    }

    public void numberReverseFor() {
        String Reverse = "  ";
        String New = Integer.toString(digit);
        for (int i = New.length() - 1; i >= 0; i--) {
            Reverse = Reverse + New.charAt(i);
        }
        System.out.println(Reverse);
    }

    public void factorial() {
        int Factor = 1;
        for (int i = digit; i > 0; i--) {
            Factor = Factor * i;
        }
        System.out.println(Factor);
    }

    public void wordCount() {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }

    public void pyramidPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pyramidPattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void squarePattern1() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void triangePattern1() {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                System.out.print(" ");
            }


            for (int k = 0; k <= i; k++) {

                System.out.print("*");
            }
        }
        System.out.println();
    }
    public void equals(){
        String Name = "Dinesh";
        String RevisedName = "Dinesh";
        String LatestName = new String("Dinesh");
        String LatestNameUpdated = new String("Dinesh");
        if(Name==RevisedName){
            System.out.println("First");
        }
        if(Name.equals(RevisedName)){
            System.out.println("Second");
        }
        if(Name.equals(LatestName)){
            System.out.println("Second");
        }
        if(Name==LatestName){
            System.out.println("Third");
        }
        if(Name.equals(LatestNameUpdated)){
            System.out.println("Four");
        }
        if(Name==LatestNameUpdated){
            System.out.println("Fifth");
        }
    }
    @Test
    public void wordCount1() {
        String Name = "My name is Dinesh and she is my friend";
        Name = Name.toUpperCase();
        String[] wordSplit = Name.split(" ");
        System.out.println(wordSplit);
        Map<String, Integer> map = new HashMap<>();

        for (String s : wordSplit) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, ++count);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        String common = " ";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            common += key + "" + value;
        }
        System.out.println(common);
    }
    @Test
    public void reverseArray() {
        int n=5;
        int [] s1 = {4,6,2,5,8};
        int [] s2 = new int[n];
        int j=n;
        for(int i=0;i<n;i++){
            s2[j-1]  = s1[i];
            j= j-1;
        }
        for(int k=0;k< n;k++){
            System.out.println(s2[k]);
        }
        }
    @Test
    public void reverseArrayW() {
        int n=5;
        int temp;
        int [] s1 = {4,6,2,5,8};
        for(int i=0;i<n/2;i++){
            temp = s1[i];
            s1[i] = s1[n-i-1];
            s1[n-i-1] = temp;
        }
        for(int k=0;k< n;k++){
            System.out.println(s1[k]);
        }
}
    @Test
    public void secondLargest() {
        int [] s1 = {4,6,2,5,8};
        int Largest = s1[0];
        int SecondLargest = 0;
        for(int i=0;i<s1.length;i++){

            if(s1[i]>Largest){
                SecondLargest = Largest;
                Largest = s1[i];
            }
            else if(SecondLargest>s1[i]){
                SecondLargest = s1[i];
            }
    }
        System.out.println(Largest + "and" +SecondLargest);
    }

    @Test
    public void fact() {
        int number = 6;
        int fact = 1;

        for(int i=number;i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    @Test
    public void leapYear() {
        int Year = 2017;

        if((Year%4==0 && Year%100!=0) || Year%400==0){

            System.out.println("This is leap year");

        }
        else{
            System.out.println("No");
        }





    }



}








