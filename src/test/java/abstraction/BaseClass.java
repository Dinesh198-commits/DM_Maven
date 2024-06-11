package abstraction;

public abstract class BaseClass {

    public static int c;
    public static int d;

    public void name(int c,int d){

        this.c = c;
        this.d = d;
    }
    abstract  void display();


    public int getArea(int c,int d){

        return c*d;
    }

}
