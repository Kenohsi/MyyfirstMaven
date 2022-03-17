package at.ac.fhcampuswien;

import java.util.List;

public class Article {
    private String author;
    private String title;

    public Article(String author, String title) {

        this.author = author;
        this.title = title;

    }

    public Article(List<Article> articles) {

    }

    public Article() {

    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return author + "" + title + " \n";
    }
}
