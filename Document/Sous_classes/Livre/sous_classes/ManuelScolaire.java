package PROJET.Document.Sous_classes.Livre.sous_classes;

import PROJET.Document.Sous_classes.Livre.Livre;

public class ManuelScolaire extends Livre {
    private String matiere;
    private String niveauScolaire;

    public ManuelScolaire(String isbn, String titre, String auteurs, String editeur, int anneeEdition, String url,
            int nbrPage,String tome, String type, String matiere, String niveauScolaire) {
        super(isbn, titre, auteurs, editeur, anneeEdition, url, nbrPage,
                tome, type);
        this.matiere = matiere;
        this.niveauScolaire = niveauScolaire;
    }

    // Getters and setters
    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getNiveauScolaire() {
        return niveauScolaire;
    }

    public void setNiveauScolaire(String niveauScolaire) {
        this.niveauScolaire = niveauScolaire;
    }

}
