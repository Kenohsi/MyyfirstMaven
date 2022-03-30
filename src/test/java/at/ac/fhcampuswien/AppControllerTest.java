package at.ac.fhcampuswien;

import org.junit.jupiter.api.*;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


public class AppControllerTest {
    private PrintStream originalOut;
    private InputStream originalIn;

    @BeforeAll
    public static void begin() {
        System.out.println("Testing NewsApp from NetSquad");
    }

    @AfterAll
    public static void finish() {
        System.out.println("Testing NewsApp from NetSquad Finished");
    }

    @BeforeEach
    public void beforeEach() throws IOException {
        originalOut = System.out;
        originalIn = System.in;

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        System.setIn(pis);
    }

    @AfterEach
    public void afterEach() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }


    @Test
    public void setArticles1() {
        try {
            //to see if the number of the Articles are the same.
            List<Article> articles = new ArrayList<>();
            AppController controller = new AppController();
            controller.setArticles(articles);
            assertEquals(articles.size(), controller.getArticleCount());
        } catch (Exception e) {
            System.out.println("The amount of articles donot match what is expected to return.");
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
        //to check if all the articles come out when we call upon this method.
        try {
            List<Article> articles;
            AppController controller = new AppController();
            List<Article> articles1 = new ArrayList<>();
            Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
            articles1.add(one);
            Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
            articles1.add(two);
            Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
            articles1.add(three);
            Article four = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
            articles1.add(four);
            articles = controller.getTopHeadlinesAustria();
            assertEquals(articles.size(), articles1.size());
            assertEquals(articles1.containsAll(articles), articles.containsAll(articles1));
        } catch (Exception e) {
            e.printStackTrace();
            fail("The articles don't match the Top Headlines!");
        }
    }

    @Test
    public void getTopHeadlinesAustria2() {
        //to check if our list is returning the right amount when we call upon this method.
        List<Article> articles;
        AppController controller = new AppController();
        List<Article> articles1 = new ArrayList<>();
        Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
        articles1.add(one);
        Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
        articles1.add(two);
        Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles1.add(three);
        Article four = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
        articles1.add(four);
        articles = controller.getTopHeadlinesAustria();
        assertEquals(articles.size(), articles1.size());
    }


    @Test
    public void getAllNewsBitcoin1() {
        //to check if the method is returning what is expected of it to return all bitcoin news.

        List<Article> articles;
        AppController controller = new AppController();
        List<Article> articles1 = new ArrayList<>();
        Article one = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles1.add(one);
        Article two = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
        articles1.add(two);
        articles = controller.getAllNewsBitcoin();
        assertEquals(articles1.containsAll(articles), articles.containsAll(articles1));
    }

    @Test
    public void getAllNewsBitcoin2() {
        //to check if the method is returning the amount that is supposed to come out when we call upon this method.
        List<Article> articles;
        AppController controller = new AppController();
        List<Article> articles1 = new ArrayList<>();
        Article one = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles1.add(one);
        Article two = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
        articles1.add(two);
        articles = controller.getAllNewsBitcoin();
        assertEquals(articles.size(), articles1.size());
    }


    @Test
    public void filterList() {
        //to check if the method filterlist() is doing what it is supposed to do when we call upon this method.
        List<Article> articles;
        AppController controller = new AppController();
        articles = controller.getTopHeadlinesAustria();

        List<Article> articles1 = new ArrayList<>();
        Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
        articles1.add(one);
        Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
        articles1.add(two);
        Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles1.add(three);
        Article four = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
        articles1.add(four);

        for (int i = 0; i < articles1.size(); i++) {
            assertEquals(articles1.get(i).getTitle().toLowerCase().contains(controller.query.toLowerCase()), (articles.get(i).getTitle().toLowerCase().contains(controller.query.toLowerCase())));  // compares query
        }
    }
}





