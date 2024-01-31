package PROJET.Document.Sous_classes.Dictionnaire.sous_classes;

import PROJET.Document.Sous_classes.Dictionnaire.Dictionnaire;

public class Encyclopedie extends Dictionnaire{
    private String sujet;
    public Encyclopedie(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url,String langue,int nbrTomes,String sujet){
        super(isbn,titre,auteurs,editeur,anneeEdition,url,langue,nbrTomes);
        this.sujet=sujet;
    }

    public String getSujet() {
        return sujet;
    }
    public void setSujet(String sujet) {
        this.sujet = sujet;
        }
}
