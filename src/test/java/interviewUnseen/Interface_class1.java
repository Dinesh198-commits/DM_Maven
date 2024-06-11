package interviewUnseen;

public class Interface_class1 implements abstraction_Implements {

    public double length;
    public double width;

    public Interface_class1(double length, double width) {
        this.length = length;
        this.width = width;

    }


    public double calculateArea(){
        return length*width;
    }


}
