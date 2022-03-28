package at.ac.fhcampuswien;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


 public class AppControllerTest{

    @BeforeAll
    public static void begin () {System.out.println("Testing NewsApp from NetSquad");
    }
    @AfterAll
    public static void finish () {System.out.println("Testing NewsApp from NetSquad Finished");
    }



    @Test
    public void setArticles1() {
        try {
            //to see if the number of the Articles are the same.
            List<Article> articles = new ArrayList<>();
            AppController controller = new AppController();
            controller.setArticles(articles);
            assertEquals(articles.size(), controller.getArticleCount());
        }catch (Exception e){
            System.out.println("Something is missing");
        }
    }
    @Test
    public void setArticles2() {
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
    public void getArticleCount1() {
        //to see if the article count is equal to amount of articles in the list.
        List<Article> articles = new ArrayList<>();
        AppController controller = new AppController();
        controller.setArticles(articles);
        assertEquals(articles.size(), controller.getArticleCount());



    }

    @Test
    public void getArticleCount2() {
        //When the article count is 0.
        List<Article> articles = new ArrayList<>();
        AppController controller = new AppController();
        controller.setArticles(articles);
        assertEquals(0, controller.getArticleCount());

    }


    @Test
    public void getTopHeadlinesAustria1() {
        //to see if the Arraylist is the one that is giving out the same list as topheadlinesaustria.
        try {
            List<Article> articles = new ArrayList<>();
            AppController controller = new AppController();
            List<Article> articles2 = new ArrayList<>();
            Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
            articles.add(one);
            Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
            articles.add(two);
            Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
            articles.add(three);
            Article four = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
            articles.add(four);
            articles2 = controller.getTopHeadlinesAustria();
            assertEquals(articles2.containsAll(articles),articles.containsAll(articles2));
        }catch (Exception e){
            System.out.println("The articles don't match the Top Headliness!");
        }

    }

    @Test
    public void getTopHeadlinesAustria2 () {


        }


    @Test
    protected List<Article> filterList (String query, List<Article> articles){
            return articles;
        } {
    }

}

