package abstractionImplements;

public class Square implements shape{

    public double side;

    public Square(double side){this.side =side;}

    public double calculateArea(){

        return side*side;
    }

}
