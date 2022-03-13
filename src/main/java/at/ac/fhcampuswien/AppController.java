package at.ac.fhcampuswien;

import java.util.List;

public class AppController extends Article {
    private List<Article> articles;


    public AppController(List<Article> articles) {
        super(articles);

        this.articles = articles;
    }

    public void setArticles (List<Article> articles) {

        }
    public int getArticleCount() {
        return 0;
    }

}
