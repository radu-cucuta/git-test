import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    ArrayList<Carte> carti;

    public  Biblioteca(){
        carti= new ArrayList<Carte>();
    }
    public void addCarte(Carte carte){
        carti.add(carte);
    }

    public boolean add(Biblioteca b){
        for (Carte c:b.carti) {
            this.addCarte(c);
        }
        return true;
    }


    @Override
    public String toString() {
	StringBuilder str = new StringBuilder();
 
        carti.forEach( carte ->{
            str.append(carte.toString());
            str.append("\n");
        });
 
        return str.toString();
    }
}
