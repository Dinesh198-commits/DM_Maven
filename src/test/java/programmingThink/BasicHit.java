package programmingThink;

import org.testng.annotations.Test;

public class BasicHit {

    @Test
    public void t1(){
        //number reverse
        int Num = 4567;
        int Rev = 0;
        try{
        while(Num!=0){
            Rev = Rev * 10 + Num%10;
            Num = Num/10;
        }}
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(Rev);
    }
    @Test
    public void t2(){
        //factorial
        int Num = 45;
        int Fact = 1;
        for(int i=2;i<Num/2;i--){

            Fact = Fact * i;

        }
        System.out.println(Fact);
    }
    @Test
    public void t3() {
        //leap year
        int year = 2023;
        if((year%4 == 0 && year%100 !=0) || year%400==0){

            System.out.println("This is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    @Test
    public void t4() {

        //String reverse
        String Name = "Mohan";
        String Reverse = "";

        for(int i=Name.length()-1;i>=0;i--){

            Reverse += Name.charAt(i);
        }
        System.out.println(Reverse);
    }
    @Test
    public void t5() {
        //String reverse
        String Name = "Mohan";
        StringBuilder  sb = new StringBuilder();
        sb.append(Name);
        System.out.println(sb.reverse());
    }
    @Test
    public void t6() {
        //String reverse
        String Name = "Mohan";
        String  [] ch = Name.split("");
        for(int i=Name.length()-1;i>=0;i--){

            System.out.println(ch[i]);
        }
    }
    @Test
    public void t7() {

        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Test
    public void t8() {

        for(int i=0;i<=5;i++){
            for(int j=i;j<=5;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void t9() {
        final int n =5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i==0 || i==n-1 || j==0 || j==n-1){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        }
    @Test
    public void t10() {
        int a,b,c,d,t;
        a = 20;b =40;c = 30 ;d = 50;
        a = a + b ;
        b = a - b;
        a = a - b ;
        System.out.println(a + "and " + b);
        t = c;
        c = d;
        d = t;
        System.out.println(c + "and " + d);
        }

    @Test
    public void t11() {
        int Number = 1;
        switch (Number){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
        }
    }
    @Test
    public void t12() {
        for(int i=0;i<=10;i++){
        switch (i){
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("Even");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd");
                break;
        }
    }}
    }



