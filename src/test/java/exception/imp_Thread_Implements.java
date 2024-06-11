package exception;

public class imp_Thread_Implements implements  Runnable {

    public void run(){

        for(int i=0;i<5;i++){
            System.out.println(i);}
    }

    public static void main(String args[]){

        Imp_Thread iT = new Imp_Thread();
        Thread t = new Thread(iT);
        t.start();
    }
}


