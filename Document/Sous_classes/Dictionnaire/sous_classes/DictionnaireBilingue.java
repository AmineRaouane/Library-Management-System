package PROJET.Document.Sous_classes.Dictionnaire.sous_classes;

import PROJET.Document.Sous_classes.Dictionnaire.Dictionnaire;

public class DictionnaireBilingue extends Dictionnaire{
    private String langues;
    public DictionnaireBilingue(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url,String langue,int nbrTomes,String langues){
        super(isbn,titre,auteurs,editeur,anneeEdition,url,langue,nbrTomes);
        this.langues=langues;
    }

    public String getLangues() {
        return langues;
    }
    public void setLangues(String langues) {
        this.langues = langues;
        }
}