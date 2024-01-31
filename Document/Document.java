package PROJET.Document;

public abstract class Document {
    private final String ISBN;
    private final String titre;
    private final String auteurs;
    private final String editeur;
    private final int anneeEdition;
    private String url;

    public Document(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url) {
        this.auteurs=auteurs;
        this.ISBN = isbn;
        this.titre = titre;
        this.editeur = editeur;
        this.anneeEdition = anneeEdition;
        this.url = url;
    }

    public String getIsbn() {
        return ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public String getEditeur() {
        return editeur;
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return  "Document[" +
                "ISBN=" + ISBN +
                ", titre=" + titre +
                ", auteurs=" + auteurs +
                ", editeur=" + editeur +
                ", anneeEdition=" + anneeEdition +
                ", url=" + url +"]";
    }
    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("Document " + this + " has been destroyed.");
    }
}
