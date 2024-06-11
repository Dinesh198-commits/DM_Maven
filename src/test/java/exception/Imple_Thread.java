package exception;

import org.testng.annotations.Test;

public class Imple_Thread {

    @Test
    public void tr() throws InterruptedException {

     Thread th = new Thread();//Create
     th.start();//Runnable
     th.run();//Running
     th.sleep(2000);
     th.wait();  //Waiting stage
     //th.stop();
    }
}
