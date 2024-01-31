package PROJET.Adherent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Management_Adherent {
    private Connection con;

    public Management_Adherent(Connection con) {
        this.con = con;
    }

    public LinkedList<Adherent> RechercheParMetier(String metier) throws SQLException {
        LinkedList<Adherent> liste = new LinkedList<Adherent>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM adherent WHERE metier = '" + metier + "'");
        while (rs.next()) {
            Adherent a = new Adherent(rs.getString("nom"), rs.getString("prenom"), rs.getString("Id"),
                    rs.getString("email"), rs.getString("password"), rs.getString("metier"), rs.getString("CIN"),
                    rs.getString("CNE"));
            liste.add(a);
        }
        return liste;
    }

    public LinkedList<Adherent> RechercheParCIN(String CIN) throws SQLException {
        LinkedList<Adherent> liste = new LinkedList<Adherent>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM adherent WHERE CIN = '" + CIN + "'");
        while (rs.next()) {
            Adherent a = new Adherent(rs.getString("nom"), rs.getString("prenom"), rs.getString("Id"),
                    rs.getString("email"), rs.getString("password"), rs.getString("metier"), rs.getString("CIN"),
                    rs.getString("CNE"));
            liste.add(a);
        }
        return liste;
    }

    public LinkedList<Adherent> RechercheParCNE(String CNE) throws SQLException {
        LinkedList<Adherent> liste = new LinkedList<Adherent>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM adherent WHERE CNE = '" + CNE + "'");
        while (rs.next()) {
            Adherent a = new Adherent(rs.getString("nom"), rs.getString("prenom"), rs.getString("Id"),
                    rs.getString("email"), rs.getString("password"), rs.getString("metier"), rs.getString("CIN"),
                    rs.getString("CNE"));
            liste.add(a);
        }
        return liste;
    }

    public boolean Ajouter(Adherent D) throws SQLException {
        Statement st = con.createStatement();
        int rs = st.executeUpdate("INSERT INTO adherent VALUES('" + Integer.parseInt(D.getId()) + "','" + D.getNom()
                + "','" + D.getPrenom() + "','" + D.getEmail() + "','" + D.getPassword() + "','" + D.getMetier() + "','"
                + D.getCIN() + "','" + D.getCNE() + "')");
        if (rs == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Supprimer(String ID) throws SQLException {
        Statement st = con.createStatement();
        int rs = st.executeUpdate("DELETE FROM adherent WHERE Id = '" + ID + "'");
        if (rs == 1) {
            return true;
        } else {
            return false;
        }
    }

    public LinkedList<Adherent> getall() throws SQLException {
        LinkedList<Adherent> liste = new LinkedList<Adherent>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM adherent");
        while (rs.next()) {
            Adherent a = new Adherent(rs.getString("nom"), rs.getString("prenom"), rs.getString("Id"),
                    rs.getString("email"), rs.getString("password"), rs.getString("metier"), rs.getString("CIN"),
                    rs.getString("CNE"));
            liste.add(a);
        }
        return liste;
    }
}
