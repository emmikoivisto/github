import java.util.ArrayList;

public class GitHubAccount {
    private String username;
    private String name;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name, AccountType accountType){
        this.username = username;
        this.name = name;
        this.repositories = new ArrayList<>();
        this.accountType = accountType;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public String getUsername(){
        return this.username;
    }

    public int getRepositories(){
        return this.repositories.size();
    }

    public void addRepository(Repository repository){
        this.repositories.add(repository);
    }

    public Repository getRepositoryByName(String repoToFind) {
        Repository foundRepo = null;
        for (Repository repository : this.repositories) {
            if (repository.getRepoName().equals(repoToFind)) {
                foundRepo = repository;
            }
        }
        return foundRepo;
    }
}
