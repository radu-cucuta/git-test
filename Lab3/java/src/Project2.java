import java.util.ArrayList;

public class Project2 {
    public static void Main(){
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask("mesaj1"));
        tasks.add(new OutTask("mesaj1"));
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());
        tasks.add(new CounterOutTask());


        for(Task j:tasks)
            j.execute();
    }
}

