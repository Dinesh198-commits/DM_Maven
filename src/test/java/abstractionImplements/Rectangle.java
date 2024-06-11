package abstractionImplements;

public class Rectangle implements shape{

    public double length;
    public double width;

    public Rectangle(double length,double width){this.length =length;this.width =width;}

    public double calculateArea(){

        return length*width;
    }

}
