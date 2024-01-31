package PROJET.Document.Sous_classes.Magazine;

import PROJET.Document.Document;

public class Magazine extends Document{
    private String période;
    private final String mois;
    private final String jour;
    public Magazine(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url,String période,String mois,String jour){
        super(isbn,titre,auteurs,editeur,anneeEdition,url);
        this.période=période;
        this.mois=mois;
        this.jour=jour;
    }
    public String getPériode(){
        return période;
    }
    public void setPériode(String p){
        this.période = p;
    }
    public String getMois(){
        return mois;
    }
    public String getJour(){
        return jour;
    }
    public String toString(){
        return "Magazine :"+super.toString()+"\nPeriode="+période+"\nMois="+mois+"\njour="+jour;
    }
}
