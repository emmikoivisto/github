import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("Initial commit", 2345);
    }

    @Test
    public void checkCommitHasID(){
        assertEquals(2345, commit.getID());
    }
}
