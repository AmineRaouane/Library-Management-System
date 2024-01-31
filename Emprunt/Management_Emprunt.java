package PROJET.Emprunt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Management_Emprunt {
    private Connection con;

    public Management_Emprunt(Connection con) {
        this.con = con;
    }

    public boolean addEmprunt(Emprunt E) throws SQLException {
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO emprunt VALUES ('" + E.getID() + "','" + E.getIsbn() + "','" + E.getTitle() + "','"
                + E.getHeure() + "')";
        stmt.executeUpdate(sql);
        return true;
    }

    public boolean deleteEmprunt(String ISBN) throws SQLException {
        Statement stmt = con.createStatement();
        String sql = "DELETE FROM emprunt WHERE ISBN = '" + ISBN + "'";
        stmt.executeUpdate(sql);
        return true;
    }

    public LinkedList<Emprunt> getall() throws SQLException {
        LinkedList<Emprunt> liste = new LinkedList<Emprunt>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM emprunt");
        while (rs.next()) {
            Emprunt a = new Emprunt(rs.getString("ID"), rs.getString("ISBN"), rs.getString("Title"),
                    rs.getString("Heure"));
            liste.add(a);
        }
        return liste;
    }
}
