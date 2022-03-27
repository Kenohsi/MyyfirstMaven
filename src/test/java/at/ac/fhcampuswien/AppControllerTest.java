package at.ac.fhcampuswien;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


 public class AppControllerTest {
    // public void myFirstApp

    @BeforeAll
    public static void begin () {System.out.println("Testing NewsApp from NetSquad");
    }
    @AfterAll
    public static void finish () {System.out.println("Testing NewsApp from NetSquad Finished");
    }



    @Test
    void calledUpon() {
        AppController controller = new AppController();
        //assertEquals(controller.setArticles());

    }
    @Test
    void getArticleCount() {
        List<Article> rem_article = new ArrayList<>();
        AppController count = new AppController();
        int actual = count.getArticleCount();
        assertEquals(rem_article.size(), actual);
        rem_article.add(new Article("Author", "Article"));


    }

    @Test
    void countArticleIfNull() {
        List<Article> rem_article = null;
        AppController controller = new AppController();
        controller.setArticles(rem_article);

        assertEquals(0, controller.getArticleCount());

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

