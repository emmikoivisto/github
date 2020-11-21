import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository newRepository;
    Commit commit;
    Commit commit1;

    @Before
    public void before(){
        newRepository = new Repository("Githublab", "Java practice lab", RepositoryType.PRIVATE);
        commit = new Commit("Initial commit", "1234");
        commit1 = new Commit("Second commit", "2344");
    }

    @Test
    public void canGetRepositoryType(){
        assertEquals(RepositoryType.PRIVATE, newRepository.getRepositoryType());
    }

    @Test
    public void canGetRepoName(){
        assertEquals("Githublab", newRepository.getRepoName());
    }

    @Test
    public void canGetRepoDescription(){
        assertEquals("Java practice lab", newRepository.getDescription());
    }

    @Test
    public void commitListStartsEmpty(){
        assertEquals(0, newRepository.getCommits());
    }

    @Test
    public void canAddCommits(){
        newRepository.addCommit(commit);
        assertEquals(1, newRepository.getCommits());
    }

    @Test
    public void canGetCommitByID(){
        newRepository.addCommit(commit);
        newRepository.addCommit(commit1);
        assertEquals(commit1, newRepository.getCommitByID("2344"));
    }

}
