package programmingThink;

abstract class abstraction {

    private double length;
    private double width;

    public abstraction (double length,double width){

        this.length = length;
        this.width = width;
    }
    public abstract void draw();

    public double getArea(){
        return length*width;
    }




}
