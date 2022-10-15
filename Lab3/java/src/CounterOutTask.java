
public class CounterOutTask implements Task{
    public static int counter = 0;
    @Override
    public void execute() {
        counter+=1;
        System.out.println("Counterul are valoarea: "+String.valueOf(counter)+"\n");
    }
}
