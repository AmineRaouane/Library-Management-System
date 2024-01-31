package PROJET.Emprunt;

import java.time.LocalDateTime;

public class Emprunt {
    private String ID;
    private String isbn;
    private String Title;
    private String Heure;
    public Emprunt(String ID,String isbn,String Title) {
        this.ID = ID;
        this.isbn=isbn;
        this.Title = Title;
        this.Heure = String.valueOf(LocalDateTime.now());
    }

    public Emprunt(String ID,String isbn,String Title,String L) {
        this.ID = ID;
        this.isbn=isbn;
        this.Title = Title;
        this.Heure = L;
    }

    public String getID() {
        return ID;
    }
    public String getTitle() {
        return Title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getHeure() {
        return Heure;
    }
}
