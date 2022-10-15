package ThreadUtility;

public class PrintThreadName {
    public static void execute(){
        System.out.println(Thread.currentThread().getName()+'\n');
    }
}
