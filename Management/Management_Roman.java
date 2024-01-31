package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Livre.sous_classes.Roman;



public class Management_Roman extends Management<Roman> {
    private Connection connection;

    public Management_Roman(Connection connection) {
        this.connection = connection;
    }

    @Override
    public LinkedList<Roman> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM roman WHERE ISBN =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }
    
    public LinkedList<Roman> RechercheParTitre(String titre) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM Roman WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }
    
    public LinkedList<Roman> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM Roman WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }
    
    public LinkedList<Roman> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM Roman WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }

    public LinkedList<Roman> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM Roman WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }

    public LinkedList<Roman> RechercheParType(String type) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM Roman WHERE type =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, type);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }

    public LinkedList<Roman> RechercheParGenre(String genre) throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM Roman WHERE genre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, genre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }

    public boolean Ajouter(Roman E) throws SQLException{
        String sql = "INSERT INTO Roman VALUES(?,?,?,?,?,?,?,?,?,?,?)";
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
            preparedStatement.setString(10, E.getGenre());
            preparedStatement.setString(11, E.getResume());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM Roman WHERE isbn =?";
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

    public LinkedList<Roman> getall() throws SQLException {
        LinkedList<Roman> listeRoman = new LinkedList<>();
        String sql = "SELECT * FROM roman ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Roman roRoman = new Roman(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("genre"),
                resultSet.getString("resume"));
            listeRoman.add(roRoman);
        }
        return listeRoman;
    }
}
