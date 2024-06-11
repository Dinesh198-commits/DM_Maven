package exception;

public class TSynch {

    public static void main(String args[]){
       Example ex = new Example();
        T t1 = new T(ex);
        T t2 = new T(ex);
        T t3 = new T(ex);
        t1.start();
        t2.start();
        t3.start();
    }

}
