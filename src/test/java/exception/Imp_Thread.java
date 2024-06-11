package exception;

public class Imp_Thread extends Thread{

     public void run(){

         for(int i=0;i<5;i++){
         System.out.println(i);}
     }

     public static void main(String args[]){

       Imp_Thread iT = new Imp_Thread();
       iT.start();
     }
}
