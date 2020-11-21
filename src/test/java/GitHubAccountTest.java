import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;
    Repository repository;
    Repository repository1;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Coder", "Alfred", AccountType.FREE);
        repository = new Repository("GithubLab", "Weekend homework", RepositoryType.PRIVATE);
        repository1 = new Repository("Hotel Lab", "Homework", RepositoryType.PUBLIC);
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canChangeAccountType(){
        assertEquals(AccountType.PRO, gitHubAccount.changeAccountType());
    }

    @Test
    public void canGetUsername(){
        assertEquals("Coder", gitHubAccount.getUsername());
    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, gitHubAccount.getRepositories());
    }

    @Test
    public void canAddRepository(){
        gitHubAccount.addRepository(repository);
        assertEquals(1, gitHubAccount.getRepositories());
    }

    @Test
    public void canAddMultipleRepos(){
        gitHubAccount.addRepository(repository);
        gitHubAccount.addRepository(repository);
        gitHubAccount.addRepository(repository);
        assertEquals(3, gitHubAccount.getRepositories());
    }

    @Test
    public void caGetRepositoryByName(){
        gitHubAccount.addRepository(repository);
        gitHubAccount.addRepository(repository1);
        assertEquals(repository1, gitHubAccount.getRepositoryByName("Hotel Lab"));
    }
}
