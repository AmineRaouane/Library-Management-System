package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Magazine.sous_classes.JournaleSciene;



;

public class Management_JournaleSciene  extends Management<JournaleSciene>{
    private Connection connection;

    public Management_JournaleSciene(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<JournaleSciene> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }
    
    public LinkedList<JournaleSciene> RechercheParTitre(String titre) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }
    
    public LinkedList<JournaleSciene> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }
    
    public LinkedList<JournaleSciene> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }

    public LinkedList<JournaleSciene> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }

    public LinkedList<JournaleSciene> RechercheParMois(String mois) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE mois =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, mois);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }

    public LinkedList<JournaleSciene> RechercheParsubject(String subject) throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene WHERE subject =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, subject);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }

    public boolean Ajouter(JournaleSciene E) throws SQLException{
        String sql = "INSERT INTO JournaleSciene VALUES(?,?,?,?,?,?,?,?,?,?)";
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
            preparedStatement.setString(10, E.getSubject());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM JournaleSciene WHERE isbn =?";
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

    public LinkedList<JournaleSciene> getall() throws SQLException {
        LinkedList<JournaleSciene> listeJournaleSciene = new LinkedList<>();
        String sql = "SELECT * FROM JournaleSciene ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            JournaleSciene mangJournaleSciene = new JournaleSciene(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("période"),
                resultSet.getString("mois"),
                resultSet.getString("jour"),
                resultSet.getString("subject"));
            listeJournaleSciene.add(mangJournaleSciene);
        }
        return listeJournaleSciene;
    }
}
