package ThreadUtility;

public class MyThread extends Thread {

    public void run(){
        System.out.println("ThreadUtility.MyThread running\n");
        PrintThreadName.execute();
    }
}