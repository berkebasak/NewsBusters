package use_case.search_news;

import model.Article;
import java.util.List;

public class SearchNewsOutputData {
    private final List<Article> articles;
    private final String message;

    public SearchNewsOutputData(List<Article> articles, String message) {
        this.articles = articles;
        this.message = message;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public String getMessage() {
        return message;
    }
}
