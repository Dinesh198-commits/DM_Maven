package programmingThink;

import java.awt.*;

public class AbstractionMainMethod extends abstraction{

    public AbstractionMainMethod(double length,double width){

        super(length, width);
    }
    public void draw(){

        System.out.println("drawing area");
    }

    public static void main(String[] args){

        abstraction area = new AbstractionMainMethod(10,10);
        area.draw();
        System.out.println("Area");


    }


}
