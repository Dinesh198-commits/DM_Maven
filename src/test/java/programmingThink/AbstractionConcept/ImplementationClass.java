package programmingThink.AbstractionConcept;

public class ImplementationClass extends BaseClass{

    public ImplementationClass(double length,double width){

        super(length, width);
    }

    public void draw(){

        System.out.println("Area");
    }

    public static void main(String[] args){

        BaseClass area = new ImplementationClass(5,7);
        area.draw();
        System.out.println("Area" + area.getArea());
    }

}
