package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    public void testGetId() {
        Long idLong = 1l;
        category.setId(idLong);
        assertEquals(idLong, category.getId());
    }

    public void testGetDescription() {
    }

    public void testGetRecipes() {
    }
}