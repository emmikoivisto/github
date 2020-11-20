import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository newRepository;
    Commit commit;

    @Before
    public void before(){
        newRepository = new Repository("Githublab", "Java practice lab", RepositoryType.PRIVATE);
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

//    @Test
//    public void canGetCommitByID(){
//
//    }

}
