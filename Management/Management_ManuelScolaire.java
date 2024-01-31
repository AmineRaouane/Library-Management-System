package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Livre.sous_classes.ManuelScolaire;



public class Management_ManuelScolaire extends Management<ManuelScolaire> {
    private Connection connection;

    public Management_ManuelScolaire(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<ManuelScolaire> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }
    
    public LinkedList<ManuelScolaire> RechercheParTitre(String titre) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }
    
    public LinkedList<ManuelScolaire> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }
    
    public LinkedList<ManuelScolaire> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }

    public LinkedList<ManuelScolaire> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }

    public LinkedList<ManuelScolaire> RechercheParType(String type) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE type =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, type);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }

    public LinkedList<ManuelScolaire> RechercheParMatiere(String matiere) throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire WHERE matiere =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, matiere);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }

    public boolean Ajouter(ManuelScolaire E) throws SQLException{
        String sql = "INSERT INTO ManuelScolaire VALUES(?,?,?,?,?,?,?,?,?,?,?)";
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
            preparedStatement.setString(10, E.getMatiere());
            preparedStatement.setString(11, E.getNiveauScolaire());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM ManuelScolaire WHERE isbn =?";
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
    public LinkedList<ManuelScolaire> getall() throws SQLException {
        LinkedList<ManuelScolaire> listeManuelScolaire = new LinkedList<>();
        String sql = "SELECT * FROM ManuelScolaire";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ManuelScolaire manuelScolaire = new ManuelScolaire(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getInt("nbrPage"),
                resultSet.getString("tome"),
                resultSet.getString("type"),
                resultSet.getString("matiere"),
                resultSet.getString("niveauScolaire"));
            listeManuelScolaire.add(manuelScolaire);
        }
        return listeManuelScolaire;
    }
}
