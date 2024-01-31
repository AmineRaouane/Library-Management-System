package PROJET.Adherent;

public class Adherent {
    // Private variables for the account details
    private String nom;
    private String prenom;
    private final String Id;
    private String email;
    private String password;
    private String metier;
    private final String CIN;
    private final String CNE;

    // Constructor with all the account details
    public Adherent(String nom, String prenom, String Id, String email, String password, String metier, String CIN,
            String CNE) {
        this.nom = nom;
        this.prenom = prenom;
        this.Id = Id;
        this.email = email;
        this.password = password;
        this.metier = metier;
        this.CIN = CIN;
        this.CNE = CNE;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMetier() {
        return metier;
    }

    public String getCIN() {
        return CIN;
    }

    public String getCNE() {
        return CNE;
    }

}