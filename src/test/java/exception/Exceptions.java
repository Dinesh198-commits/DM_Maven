package exception;

import org.testng.annotations.Test;

public class Exceptions {

    @Test
    public void nullPointer(){
        String Name = null;
        try{
        System.out.println(Name.length());}
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
    @Test
    public void numberFormat(){
      String Name = "Dinesh";
      try{
      int Change = Integer.parseInt(Name);
        System.out.println(Change);}
      catch (NumberFormatException F){
          System.out.println(F);
      }
    }
}
