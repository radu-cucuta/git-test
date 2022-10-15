
import java.lang.String;
public class Project1 {
    public static void Main(){
        Carte c1= new Carte("Ion","Liviu Rebreanu",1980,100);
        Carte c2= new Carte("Marile Sperante","Charles Dickens",1970,200);

        Biblioteca b1 = new Biblioteca();
        Biblioteca b2 = new Biblioteca();

        b1.addCarte(c1);
        b2.addCarte(c2);

        b1.add(b2);

        System.out.println(b1.toString());
    }
}
