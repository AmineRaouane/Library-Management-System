package PROJET.Document.Sous_classes.Dictionnaire;

import PROJET.Document.Document;

public class Dictionnaire extends Document{
    private String langue;
    private int nbrTomes;
    public Dictionnaire(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url,String langue,int nbrTomes){
        super(isbn,titre,auteurs,editeur,anneeEdition,url);
        this.langue=langue;
        this.nbrTomes=nbrTomes;
        }
    public String getLangue(){
        return langue;
    }
    
    public int getNbrTomes(){
        return nbrTomes;
    }
    public String toString(){
        return "Dictonnaire:"+super.toString()+"\nLangue="+langue+"\nnbrTomes="+nbrTomes;
    }
}