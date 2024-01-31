package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Magazine.sous_classes.Manga;




public class Management_Manga extends Management<Manga> {
    private Connection connection;

    public Management_Manga(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<Manga> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }
    
    public LinkedList<Manga> RechercheParTitre(String titre) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }
    
    public LinkedList<Manga> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }
    
    public LinkedList<Manga> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }

    public LinkedList<Manga> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }

    public LinkedList<Manga> RechercheParMois(String mois) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE mois =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, mois);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }

    public LinkedList<Manga> RechercheParArtiste(String artiste) throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga WHERE artiste =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, artiste);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }

    public boolean Ajouter(Manga E) throws SQLException{
        String sql = "INSERT INTO Manga VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, E.getIsbn());
            preparedStatement.setString(2, E.getTitre());
            preparedStatement.setString(3, E.getAuteurs());
            preparedStatement.setString(4, E.getEditeur());
            preparedStatement.setInt(5, E.getAnneeEdition());
            preparedStatement.setString(6, E.getUrl());
            preparedStatement.setString(7, E.getPériode());
            preparedStatement.setString(8, E.getMois());
            preparedStatement.setString(9, E.getJour());
            preparedStatement.setString(10, E.getArtiste());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM Manga WHERE isbn =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, isbn);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public LinkedList<Manga> getall() throws SQLException {
        LinkedList<Manga> listeManga = new LinkedList<>();
        String sql = "SELECT * FROM Manga";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Manga mangManga = new Manga(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("artiste"));
            listeManga.add(mangManga);
        }
        return listeManga;
    }
}