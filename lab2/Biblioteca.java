import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    ArrayList<Carte> carti;

    public  Biblioteca(){
        carti= new ArrayList<Carte>();
    }
    public void addCarte(Carte carte){
        ceafbkjaf
    }

    public boolean add(Biblioteca b){
        for (Carte c:b.carti) {
            this.addCarte(c);
        }
	//trebuia sa modific cu foreach in loc de iterator
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
