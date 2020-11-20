import java.util.ArrayList;

public class Repository {

    private String repositoryName;
    private String description;
    private ArrayList<Commit> commits;
    private RepositoryType repository;

    public Repository(String repositoryName, String description, RepositoryType repository){
        this.repositoryName = repositoryName;
        this.description = description;
        this.repository = repository;
    }
}
