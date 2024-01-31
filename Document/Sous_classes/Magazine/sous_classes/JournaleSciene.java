package PROJET.Document.Sous_classes.Magazine.sous_classes;

import PROJET.Document.Sous_classes.Magazine.Magazine;

public class JournaleSciene extends Magazine{
    private String subject;
    public JournaleSciene(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url, String période, String mois, String jour, String subject) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url, période, mois, jour);
        this.subject=subject;
    }

    //getters and setters
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
