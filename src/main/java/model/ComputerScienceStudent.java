package model;

public class ComputerScienceStudent extends Student {


    private String favoriteLang;

    public ComputerScienceStudent(String id, String name, String favoriteLang) {
        super(id, name);
        this.favoriteLang = favoriteLang;
    }


    public String getFavoriteLang() {
        return favoriteLang;
    }

    public void setFavoriteLang(String favoriteLang) {
        this.favoriteLang = favoriteLang;
    }

    @Override
    public String getCourse() {
        return "test for abstract method";
    }
}
