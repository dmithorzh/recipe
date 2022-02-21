package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import junit.framework.TestCase;
import org.h2.index.Index;
import org.junit.Before;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class IndexControllerTest extends TestCase {

    IndexController indexController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

    public void testGetIndexPage() {
        assertEquals("index", indexController.getIndexPage(model));
        assertEquals("index", indexController.getIndexPage(model));
        verify(model, times(1)).addAttribute("recipes" , recipeService.getRecipes());

    }
}