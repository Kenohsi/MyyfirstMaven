package at.ac.fhcampuswien;

import java.awt.Menu;
import java.util.List;

public class AppController extends Menu {
    private List<Article> articles;


    public AppController(List<Article> articles, AppController controller) {
        super();
        this.articles = articles;
    }

    public void setArticles (List<Article> articles) {

    }
    public int getArticleCount() {
        return 0;
    }

    public List<Article> getTopHeadlinesAustria () {
        return articles;
    }
    public List<Article> getAllNewsBitcoin () {
        return articles;
    }
    protected List<Article> filterList (String query, List<Article> articles){
        return articles;
    }
    private List<Article> generateMockList () {
        return articles;
    }

}



