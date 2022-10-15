import ThreadUtility.MyThread;
import ThreadUtility.MyThreadRunnable;

public class Project3 {
    public static void Main(){
        MyThread thread1 =new MyThread();
        thread1.start();

        MyThreadRunnable obj=new MyThreadRunnable();
        Thread t = new Thread(obj);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim runnable");
            }
        }).start();
    }
}
