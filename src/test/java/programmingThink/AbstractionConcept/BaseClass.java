package programmingThink.AbstractionConcept;



abstract class BaseClass {
    private double length;
    private double width;
    
    public BaseClass(double length,double width){
        
        this.length = length;
        this.width = width;
    }
    public abstract void draw();

    public double getArea(){

        return length * width;
    }
    
    
}
