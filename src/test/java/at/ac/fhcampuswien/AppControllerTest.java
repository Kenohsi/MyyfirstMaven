package at.ac.fhcampuswien;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Test
 public class AppControllerTest {
    // public void myFirstApp


    @Test
    void calledUpon() {
        AppController controller = new AppController();
        //assertEquals(controller.setArticles());

    }
    @Test
    void CountArticle() {
        List<Article> articles = new ArrayList<>();
        AppController controller = new AppController();
        assertEquals(articles.size(),controller.getArticleCount());
    }
    @Test
    List<Article> getTopHeadlinesAustria (List<Article> articles) {return articles;} {
        AppController controller = new AppController();
        controller.getTopHeadlinesAustria();


    }

    @Test
    public List<Article> getAllNewsBitcoin (List<Article> articles) {
            return articles;
        } {
    }

    @Test
    protected List<Article> filterList (String query, List<Article> articles){
            return articles;
        } {
    }

}

