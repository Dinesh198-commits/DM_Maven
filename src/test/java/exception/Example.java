package exception;

public class Example {
    public void display(){
        Thread G = Thread.currentThread();
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(2000);
                System.out.println(G.getName() + " " +i);
        }
            catch (Exception e){

            }
    }
    }
}
