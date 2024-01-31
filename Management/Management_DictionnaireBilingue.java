package PROJET.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import PROJET.Document.Sous_classes.Dictionnaire.sous_classes.DictionnaireBilingue;


public class Management_DictionnaireBilingue extends Management<DictionnaireBilingue>{
    private Connection connection;

    public Management_DictionnaireBilingue(Connection connection) {
        this.connection = connection;
    }

    public LinkedList<DictionnaireBilingue> RechercheParIsbn(String isbn) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE isbn =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, isbn);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"), 
                resultSet.getString("editeur"), 
                resultSet.getInt("anneeEdition"), 
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }
    
    public LinkedList<DictionnaireBilingue> RechercheParTitre(String titre) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE titre =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, titre);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }
    
    public LinkedList<DictionnaireBilingue> RechercheParEditeur(String editeur) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE editeur =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, editeur);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }
    
    public LinkedList<DictionnaireBilingue> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE anneeEdition =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, anneeEdition);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }

    public LinkedList<DictionnaireBilingue> RechercheParAuteur(String auteur) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE auteurs =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+auteur+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }

    public LinkedList<DictionnaireBilingue> RechercheParLangue(String langue) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE langue =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, langue);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }

    public LinkedList<DictionnaireBilingue> RechercheParLangues(String langues) throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue WHERE langues =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%"+langues+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }

    public boolean Ajouter(DictionnaireBilingue E) throws SQLException{
        String sql = "INSERT INTO DictionnaireBilingue VALUES(?,?,?,?,?,?,?,?,?)";
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
            preparedStatement.setString(9, E.getLangues());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Supprimer(String isbn) throws SQLException{
        String sql = "DELETE FROM dictionnairebilingue WHERE isbn =?";
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

    public LinkedList<DictionnaireBilingue> getall() throws SQLException {
        LinkedList<DictionnaireBilingue> listeDictionnaireBilingue = new LinkedList<>();
        String sql = "SELECT * FROM dictionnairebilingue";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DictionnaireBilingue dictionnaireBilingue = new DictionnaireBilingue(
                resultSet.getString("isbn"),
                resultSet.getString("titre"),
                resultSet.getString("auteurs"),
                resultSet.getString("editeur"),
                resultSet.getInt("anneeEdition"),
                resultSet.getString("url"),
                resultSet.getString("langue"),
                resultSet.getInt("nbrTomes"),
                resultSet.getString("langues"));
            listeDictionnaireBilingue.add(dictionnaireBilingue);
        }
        return listeDictionnaireBilingue;
    }
}
