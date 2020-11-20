import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;
    Repository repository;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Coder", "Alfred", AccountType.FREE);
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canGetUsername(){
        assertEquals("Coder", gitHubAccount.getUsername());
    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, gitHubAccount.getRepositories());
    }
}
