import org.junit.Before;

public class RepositoryTest {

    Repository newRepository;

    @Before
    public void before(){
        newRepository = new Repository("Githublab", "Java practice lab", RepositoryType.PRIVATE);
    }
}
