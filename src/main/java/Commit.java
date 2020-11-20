public class Commit {
    private String description;
    private int uniqueID;

    public Commit(String description, int uniqueID){
        this.description = description;
        this.uniqueID = uniqueID;
    }

    public int getID(){
        return this.uniqueID;
    }

}
