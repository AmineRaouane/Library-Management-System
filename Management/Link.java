package PROJET.Management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import PROJET.Adherent.Management_Adherent;
import PROJET.Emprunt.Management_Emprunt;
import PROJET.Kindle.Management_Kindle;




public class Link {
    private Connection con;

    public Link() throws SQLException {

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque",
                "root", "");
    }
    public Management_DictionnaireBilingue BILINGUEDB(){
        return new Management_DictionnaireBilingue(con);
    }
    public Management_Encyclopedie ENCYCLOPEDIEDB(){
        return new Management_Encyclopedie(con);
    }
    public Management_JournaleSciene JOURNALEBD(){
        return new Management_JournaleSciene(con);
    }
    public Management_Literature LITERATUREDB(){
        return new Management_Literature(con);
    }
    public Management_MagazineFashion FASHIONDB(){
        return new Management_MagazineFashion(con);
    }
    public Management_Manga MANGADB() {
        return new Management_Manga(con);
    }
    public Management_ManuelScolaire MANUELDB(){
        return new Management_ManuelScolaire(con);
    }
    public Management_Roman ROMANDB(){
        return new Management_Roman(con);
    }
    public Management_Kindle KINDLEDB() {
        return new Management_Kindle(con);
    }
    public Management_Emprunt EMPRUNTDB() {
        return new Management_Emprunt(con);
    }
    public Management_Adherent ADHERENTDB() {
        return new Management_Adherent(con);
    }
}
