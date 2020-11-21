public class Commit {
    private String description;
    private String uniqueID;

    public Commit(String description, String uniqueID){
        this.description = description;
        this.uniqueID = uniqueID;
    }

    public String getID(){
        return this.uniqueID;
    }

    public String getDescription(){
        return this.description;
    }



}
