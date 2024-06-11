package programmingThink.oops;

public class Overloading {

    //

    public int sum(int a,int b){

        return a + b;
    }
    public double sum(double a,double b){

        return a + b;
    }
    public int sum(int a,int b,int c){

        return a + b + c;
    }
    public double sum(int a,double b){

        return
        a + b;
    }

    public static void main (String[] args){

        Overloading os = new Overloading();
        System.out.println(os.sum(5,8));
        System.out.println(os.sum(6,7.8));
        System.out.println(os.sum(5,7,8));
        System.out.println(os.sum(5.6,7.8));

    }
}
