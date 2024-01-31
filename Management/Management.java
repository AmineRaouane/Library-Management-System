package PROJET.Management;
import java.sql.SQLException;
import java.util.LinkedList;
import PROJET.Document.Document;

public abstract class Management<T extends Document> {
    abstract LinkedList<T> RechercheParIsbn(String isbn) throws SQLException;
    abstract LinkedList<T> RechercheParTitre(String titre) throws SQLException;
    abstract LinkedList<T> RechercheParEditeur(String editeur) throws SQLException;
    abstract LinkedList<T> RechercheParAnneeEdition(Integer anneeEdition) throws SQLException;
    abstract LinkedList<T> RechercheParAuteur(String auteur) throws SQLException;
    abstract boolean Ajouter(T Document) throws SQLException;
    abstract boolean Supprimer(String titre) throws SQLException;
    abstract LinkedList<T>  getall() throws SQLException;
}

