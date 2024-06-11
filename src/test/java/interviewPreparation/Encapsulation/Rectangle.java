package interviewPreparation.Encapsulation;

public class Rectangle implements Shape{

    public int length;
    public int width;

    public Rectangle(int length,int width){

        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
