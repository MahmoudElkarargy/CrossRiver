package model;

public enum LOAD {
    LOAAD("view/resources/LoadChooser/save.png","Load Game"),
    NEW("view/resources/LoadChooser/open.png","New Game");

    private String urlLoad, name;
    private LOAD(String urlLoad, String name){
        this.urlLoad = urlLoad;
        this.name = name;
    }
    public String getUrl(){
        return this.urlLoad;
    }
    public String getName(){
        return this.name;
    }
}
