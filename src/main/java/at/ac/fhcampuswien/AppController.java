package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private List<Article> articles;
    public String query = "bitcoin";

    public AppController() {
        this.articles = generateMockList();
    }


    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getArticleCount() {
        if (articles == null) {
            return 0;
        } else {
            return articles.size();
        }

    }

    public List<Article> getTopHeadlinesAustria() {
        //for (int i = 0; i < generateMockList().size(); i++) {
        return generateMockList();

    }
    //return articles;
    //}

    public List<Article> getAllNewsBitcoin() {

        this.query = query;
        return filterList(query, articles);
    }

    protected List<Article> filterList(String query, List<Article> articles) {
        List<Article> rem_article = new ArrayList<>();
        for (Article a : articles) {
            if (a.getTitle().toLowerCase().contains(query.toLowerCase())) {
                rem_article.add(a);
            }
        }

        return rem_article;
    }

    private static List<Article> generateMockList() {
        List<Article> articles = new ArrayList();
        Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
        articles.add(one);
        Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
        articles.add(two);
        Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles.add(three);
        Article four = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
        articles.add(four);
        return articles;
    }


}



