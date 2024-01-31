package PROJET.Kindle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Management_Kindle {
    private Connection con;
    public Management_Kindle(Connection con) {
        this.con = con;
    }

    public boolean addKindle(Kindle E) throws SQLException{
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO kindle VALUES ('"+E.getID()+"','"+E.getUrl()+"')";
        stmt.executeUpdate(sql);
        return true;
    }

    public boolean deleteKindle(String ID) throws SQLException{
        Statement stmt = con.createStatement();
        String sql = "DELETE FROM kindle WHERE ID = '"+ID+"'";
        stmt.executeUpdate(sql);
        return true;
    }

    public LinkedList<Kindle> getall() throws SQLException{
        LinkedList<Kindle> liste = new LinkedList<Kindle>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM kindle");
        while(rs.next()){
            Kindle a = new Kindle(rs.getString("ID"),rs.getString("Url"));
            liste.add(a);
        }
        return liste;
    }
}