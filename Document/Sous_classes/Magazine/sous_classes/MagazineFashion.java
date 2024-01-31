package PROJET.Document.Sous_classes.Magazine.sous_classes;

import PROJET.Document.Sous_classes.Magazine.Magazine;

public class MagazineFashion extends Magazine{
    private String trends;
    private String Celebrities;
    public MagazineFashion(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url, String période, String mois, String jour, String trends,String Celebrities) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url, période, mois, jour);
        this.trends=trends;
        this.Celebrities=Celebrities;
    }

    //getters and setters
    public String getTrends() {
        return trends;
    }

    public void setTrends(String trends) {
        this.trends = trends;
    }

    public String getCelebrities() {
        return Celebrities;
    }

    public void setCelebrities(String celebrities) {
        Celebrities = celebrities;
    }
    

}
