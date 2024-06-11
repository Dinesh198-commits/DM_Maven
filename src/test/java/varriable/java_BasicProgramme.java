package varriable;

import io.cucumber.java.sl.In;
import org.testng.annotations.Test;

import java.util.*;

public class java_BasicProgramme {
    public static String  name1  = " Congratulation and";
    public static int   num  = 40;
    @Test
    public void reverseString(){
        String name = "madam";
        String Orignal_Name = name;
        String reverse= "";
        for(int i=name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        if(Orignal_Name.equals(reverse)){
            System.out.println("Palindrome yes");
        }
        else{
            System.out.println("No");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name1);
        System.out.println(sb.reverse());
    }
    @Test
    public void numberSwap(){
        double a = 40;
        double b = 45;
        System.out.println(a +"and" +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a +"and" +b);
    }
    @Test
    public void number_without_Swap(){
        double a = 40;
        double b = 45;
        double temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a +"and " +b);

     }

    @Test
    public void prime_Number(){
        for(int i=2;i<num/2;i++){
            if(i%2!=0){
                System.out.println("Prime number" + i);
            }
            else{
                System.out.println("Not Prime number");
            }
        }
    }
    @Test
    public void fib_Number(){
        int number = 10;
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=0;i<number;i++){
            System.out.println(a + " , ");
            a = b;
            b =c;
            c = a + b;
        }
    }
    @Test
    public void space_Remove(){
        StringBuilder sb = new StringBuilder();
        String output = "";
        for(int i=0;i<name1.length();i++){
            if(!Character.isWhitespace(name1.charAt(i))){
                sb.append(name1.charAt(i));
            }
        }
        System.out.println(sb);
    }
    @Test
    public void arraySort(){
        int arr [] = {5,2,1,6,8,3,2,5};
        int temp;
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            System.out.println(set);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
            for(int k=0;k<arr.length;k++){

                System.out.println(arr[k]);
            }
        }

    }
    @Test
    public void fact(){
        int number = 6;
        int fact =1;
        for(int i=number;i>0;i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    @Test
    public void reverseLinkedList(){
        LinkedList<Integer> ll = new LinkedList<>();
        for(int k=0;k<5;k++){
            ll.add(k);
        }

        for(int i=ll.size()-1;i>=0;i--){
            System.out.println(ll.get(i));
        }

    }
    @Test
    public void char_Count(){
        String words = "My name is Mohan and I am an engineer";
        HashMap<Character,Integer> obj = new HashMap<>();
        for(int i=0;i<=words.length()-1;i++){
            char ch = words.charAt(i);
            if(obj.containsKey(ch)){
                int count = obj.get(ch);
                obj.put(ch,++count);
            }
            else{
                obj.put(ch,1);
            }

        }
        System.out.println(obj);
    }
    @Test
    public void word_Count(){
        String words = "My name is Mohan and I am an engineer";
        String word [] = words.split(" ");
        HashMap<String,Integer> obj = new HashMap<>();
        for(String s : word){
            if(obj.containsKey(s)){
                int count = obj.get(s);
                obj.put(s,++count);
            }
            else{
                obj.put(s,1);
            }
        }
        System.out.println(obj);
    }
    @Test
    public void reverseList(){
        int [] list1 = {3,6,7,8,9,8};
        int [] list2 = new int[list1.length];
        int j = list1.length;
        for(int i=0;i< list1.length;i++){
                list2[j-1] = list1[i];
                j= j-1;

        }
        for(int i=0;i< list2.length;i++){
            System.out.println(list2[i]);
        }

    }
}
