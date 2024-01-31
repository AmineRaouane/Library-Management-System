package PROJET.Document.Sous_classes.Livre;

import PROJET.Document.Document;

public class Livre extends Document {
    private int nbrPage;
    private String tome;
    private final String type;

    public Livre(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url, int nbrPage,
            String tome, String type) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url);
        this.nbrPage = nbrPage;
        this.tome = tome;
        this.type = type;
    }

    // getters and setters
    public int getNbrPage() {
        return nbrPage;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    public String getTome() {
        return tome;
    }

    public void setTome(String tome) {
        this.tome = tome;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Livre :" + super.toString() + "\nNbrPage=" + nbrPage + "\ntome=" + tome + "\ntype=" + type;
    }
}