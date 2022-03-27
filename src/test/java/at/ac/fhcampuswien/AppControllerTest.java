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
     void setArticles1() {
         //to see if the number of the Articles are the same.
         List<Article> articles = new ArrayList<>();
         AppController controller = new AppController();
         controller.setArticles(articles);
         assertEquals(articles.size(), controller.getArticleCount());

     }
     @Test
     void setArticles2() {
         //to see if setArticles is working.
         List<Article> articles = new ArrayList<>();
         List<Article> articles1 = new ArrayList<>();
         AppController controller = new AppController();
         Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
         articles.add(one);
         controller.setArticles(articles);
         articles1.add(one);
         assertEquals(articles, articles1);
     }


    @Test
    void getArticleCount1() {
        List<Article> rem_article = new ArrayList<>();
        AppController count = new AppController();
        int actual = count.getArticleCount();
        assertEquals(rem_article.size(), actual);
        rem_article.add(new Article("Author", "Article"));


    }

    @Test
    void getArticleCount2() {
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

