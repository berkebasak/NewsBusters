package use_case.search_news;

public class SearchNewsInputData {
    private final String keyword;

    public SearchNewsInputData(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }
}
