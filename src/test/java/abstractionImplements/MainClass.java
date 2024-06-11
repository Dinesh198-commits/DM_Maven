package abstractionImplements;

public class MainClass {

    public static void main(String args[]){

        Square myCircle = new Square(5.0);
        Rectangle myRectangle = new Rectangle(4.0, 6.0);

        // Calculating and printing the areas
        System.out.println("Area of Circle: "
                + myCircle.calculateArea());
        System.out.println("Area of Rectangle: "
                + myRectangle.calculateArea());
    }
}



