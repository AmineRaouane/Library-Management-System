package PROJET.Document.Sous_classes.Livre.sous_classes;

import PROJET.Document.Sous_classes.Livre.Livre;

public class Literature extends Livre {
    private String subject;
    private String resume;

    public Literature(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url,
            int nbrPage,String tome, String type, String subject, String resume) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url, nbrPage,
                tome, type);
                this.subject = subject;
                this.resume = resume;
    }
    //getters 
    public String getSubject() {
        return subject;
    }
    public String getResume() {
        return resume;
    }
    //setters
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
}
