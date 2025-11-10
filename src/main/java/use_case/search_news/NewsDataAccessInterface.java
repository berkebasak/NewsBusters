package use_case.search_news;

import model.Article;
import java.io.IOException;
import java.util.List;

public interface NewsDataAccessInterface {
    List<Article> getArticlesByKeyword(String keyword) throws IOException;
}
