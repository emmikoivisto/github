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
        this.commits = new ArrayList<>();
    }

    public RepositoryType getRepositoryType(){
        return this.repository;
    }

    public void setRepoName(String repoName) {
        this.repositoryName = repoName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCommits(){
        return commits.size();
    }

    public String getRepoName(){
        return this.repositoryName;
    }

    public String getDescription(){
        return this.description;
    }

    public void addCommit(Commit commit){
        this.commits.add(commit);
    }

    public Commit getCommitByID(String commitToFind){
        Commit foundCommit = null;
        for(Commit commit : this.commits){
            if (commit.getID().equals(commitToFind)){
                foundCommit = commit;
            }
        }
        return foundCommit;
    }
}
