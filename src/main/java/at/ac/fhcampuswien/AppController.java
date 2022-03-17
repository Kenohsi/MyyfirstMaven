package at.ac.fhcampuswien;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AppController extends Article {
    private List<Article> articles;


    public AppController(List<Article> articles, AppController controller) {
        super();
        this.articles = articles;
    }

    public AppController() {

    }

    public void setArticles(List<Article> articles) {
    }

    public List<Article> getTopHeadlinesAustria() {

        for (int i = 0; i < generateMockList().size(); i++) {
            System.out.println(generateMockList().get(i));

        }
        return articles;
    }

    public List<Article> getAllNewsBitcoin() {
        String query = "biTcoin";
        filterList(query, articles);
        return articles;
    }

    protected List<Article> filterList(String query, List<Article> articles) {

        for (int i = 0; i < generateMockList().size(); i++) {
            if (generateMockList().get(i).toString().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(generateMockList().get(i));
            }
        }

        return articles;
    }

    private static List<Article> generateMockList() {
        List<Article> articles = new ArrayList();
        Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
        articles.add(one);
        Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
        articles.add(two);
        Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles.add(three);
        return articles;
    }

    public int getArticleCount() {
        int count = generateMockList().size();

        return count;
    }

}



