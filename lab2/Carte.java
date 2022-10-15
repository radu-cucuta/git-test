
import java.lang.String;

public class Carte implements Comparable<Carte>{
    String Titlu;
    String Autor;
    int An_aparitie;
    int Numar_pagini;

    public Carte(String Titlu,String Autor,int An_aparitie,int Numar_pagini){
        this.Titlu = Titlu;
        this.Autor = Autor;
        this.An_aparitie = An_aparitie;
        this.Numar_pagini = Numar_pagini;
    }

    @Override
    public String toString(){
        return "Carte: "+Titlu+", Autor: "+Autor+", Aparuta in Anul: "+String.valueOf(An_aparitie)+'\n';
    }
    @Override
    public int compareTo(Carte carte)
    {
        if(Numar_pagini<carte.Numar_pagini){
            return -1;
        }
        if(Numar_pagini ==  carte.Numar_pagini)
            return 0;

        return 1;
    }
}
