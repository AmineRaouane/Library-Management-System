package PROJET.Document.Sous_classes.Livre.sous_classes;

import PROJET.Document.Sous_classes.Livre.Livre;

public class Roman extends Livre {
    private String genre;
    private String resume;

    public Roman(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url, int nbrPage,
            String tome, String type, String genre, String resume) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url, nbrPage,
                tome, type);
        this.genre = genre;
        this.resume = resume;
    }

    public String getResume() {
        return resume;
    }

    public String getGenre() {
        return genre;
    }

    public void setResume(String Resume) {
        this.resume = Resume;
    }

    public void setGenre(String Genre) {
        this.genre = Genre;
    }

}
