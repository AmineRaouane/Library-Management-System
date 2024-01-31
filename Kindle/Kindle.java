package PROJET.Kindle;
public class Kindle {
    private String ID;
    private String Url;

    public Kindle(String id, String url) {
        this.ID = id;
        this.Url = url;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        this.Url = url;
    }

    public String toString() {
        return "ID : " + ID + "\nUrl : " + Url;
    }
}
