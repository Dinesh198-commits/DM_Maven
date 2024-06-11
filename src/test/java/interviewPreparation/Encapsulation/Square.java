package interviewPreparation.Encapsulation;

public class Square implements  Shape{

    public int side;

    public Square(int side){

        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}


