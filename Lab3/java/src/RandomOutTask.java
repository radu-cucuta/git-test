public class RandomOutTask implements Task{

    double random;
    public RandomOutTask(){
        random= Math.random();
    }
    @Override
    public void execute() {
        System.out.println("Numarul random este: "+String.valueOf(random)+"\n");
    }
}
