package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Livre.sous_classes.Literature;



;

public class Management_Literature  extends Management<Literature>{
    private Connection connection;

    public Management_Literature(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<Literature> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }
    
    public LinkedList<Literature> RechercheParTitre(String titre) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }
    
    public LinkedList<Literature> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }
    
    public LinkedList<Literature> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }

    public LinkedList<Literature> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, auteur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }

    public LinkedList<Literature> RechercheParType(String type) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE type =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, type);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }

    public LinkedList<Literature> RechercheParSubject(String subject) throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature WHERE subject =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, subject);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }

    public boolean Ajouter(Literature E) throws SQLException{
        String sql = "INSERT INTO Literature VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, E.getIsbn());
            preparedStatement.setString(2, E.getTitre());
            preparedStatement.setString(3, E.getAuteurs());
            preparedStatement.setString(4, E.getEditeur());
            preparedStatement.setInt(5, E.getAnneeEdition());
            preparedStatement.setString(6, E.getUrl());
            preparedStatement.setInt(7, E.getNbrPage());
            preparedStatement.setString(8, E.getTome());
            preparedStatement.setString(9, E.getType());
            preparedStatement.setString(10, E.getSubject());
            preparedStatement.setString(11, E.getResume());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM Literature WHERE isbn =?";
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
    public LinkedList<Literature> getall() throws SQLException {
        LinkedList<Literature> listeLiterature = new LinkedList<>();
        String sql = "SELECT * FROM Literature";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Literature literature = new Literature(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("subject"),
                resultSet.getString("resume"));
            listeLiterature.add(literature);
        }
        return listeLiterature;
    }
}