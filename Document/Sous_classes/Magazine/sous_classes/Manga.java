package PROJET.Document.Sous_classes.Magazine.sous_classes;

import PROJET.Document.Sous_classes.Magazine.Magazine;

public class Manga extends Magazine {
    // Declare a private variable for the artist of the manga
    private String Artiste;

    // Constructor for the Manga class
    public Manga(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url, String période, String mois, String jour, String artiste) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url, période, mois, jour);
        this.Artiste = artiste;
    }

    //getters and setters
    public String getArtiste() {
        return Artiste;
    }
    public void setArtiste(String artiste) {
        this.Artiste = artiste;
    }
}