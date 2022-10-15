import ThreadUtility.MyThread;

public class Proiect4 {
    public static void Main(){
        for(int i=0;i<10;i++){
            MyThread thread1 =new MyThread();
            thread1.setName(String.valueOf(i));
            thread1.start();
        }
    }
}
