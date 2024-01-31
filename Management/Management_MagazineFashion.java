package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Magazine.sous_classes.MagazineFashion;



;

public class Management_MagazineFashion extends Management<MagazineFashion> {
    private Connection connection;

    public Management_MagazineFashion(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<MagazineFashion> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }
    
    public LinkedList<MagazineFashion> RechercheParTitre(String titre) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }
    
    public LinkedList<MagazineFashion> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }
    
    public LinkedList<MagazineFashion> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }

    public LinkedList<MagazineFashion> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }

    public LinkedList<MagazineFashion> RechercheParMois(String mois) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE mois =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, mois);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }

    public LinkedList<MagazineFashion> RechercheParTrends(String trend) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE trends =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+trend+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }
    public LinkedList<MagazineFashion> RechercheParCelebrities(String celebrities) throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion WHERE celebrities =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, celebrities);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }

    public boolean Ajouter(MagazineFashion E) throws SQLException{
        String sql = "INSERT INTO MagazineFashion VALUES(?,?,?,?,?,?,?,?,?,?,?)";
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
            preparedStatement.setString(10, E.getTrends());
            preparedStatement.setString(11, E.getCelebrities());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM MagazineFashion WHERE isbn =?";
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

    public LinkedList<MagazineFashion> getall() throws SQLException {
        LinkedList<MagazineFashion> listeMagazineFashion = new LinkedList<>();
        String sql = "SELECT * FROM MagazineFashion";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            MagazineFashion mangMagazineFashion = new MagazineFashion(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("trends"),
                resultSet.getString("celebrities"));
            listeMagazineFashion.add(mangMagazineFashion);
        }
        return listeMagazineFashion;
    }
}