package eatonInterview.oops;

public class EncapsulationBase {


    private static String Name;
    private static int Age;

    public void setName(String Name){
       this.Name = Name;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }


}
