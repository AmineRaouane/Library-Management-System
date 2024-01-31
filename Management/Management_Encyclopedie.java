package PROJET.Management;

import java.sql.*;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Dictionnaire.sous_classes.Encyclopedie;



public class Management_Encyclopedie extends Management<Encyclopedie> {
    private Connection connection;

    public Management_Encyclopedie(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<Encyclopedie> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }
    
    public LinkedList<Encyclopedie> RechercheParTitre(String titre) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }
    public LinkedList<Encyclopedie> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }
    
    public LinkedList<Encyclopedie> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }

    public LinkedList<Encyclopedie> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }

    public LinkedList<Encyclopedie> RechercheParLangue(String langue) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE langue =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, langue);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }

    public LinkedList<Encyclopedie> RechercheParSujet(String sujet) throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie WHERE sujet =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, sujet);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }

    public boolean Ajouter(Encyclopedie E) throws SQLException{
        String sql = "INSERT INTO Encyclopedie VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, E.getIsbn());
            preparedStatement.setString(2, E.getTitre());
            preparedStatement.setString(3, E.getAuteurs());
            preparedStatement.setString(4, E.getEditeur());
            preparedStatement.setInt(5, E.getAnneeEdition());
            preparedStatement.setString(6, E.getUrl());
            preparedStatement.setString(7, E.getLangue());
            preparedStatement.setInt(8, E.getNbrTomes());
            preparedStatement.setString(9, E.getSujet());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM Encyclopedie WHERE isbn =?";
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

    public LinkedList<Encyclopedie> getall() throws SQLException {
        LinkedList<Encyclopedie> listeEncyclopedie = new LinkedList<>();
        String sql = "SELECT * FROM Encyclopedie ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Encyclopedie encyclopedie = new Encyclopedie(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("sujet"));
            listeEncyclopedie.add(encyclopedie);
        }
        return listeEncyclopedie;
    }

}