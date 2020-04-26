package lecture4;

public interface NewsInterface {

    void insertNews(News news);
    void updateNews(String idNews, News newsUpdate);
    void deleteNews(String idNews);

    News[] findByName(String name);
    News[] findByCategory(String cateName);

    News findHotNewsByCategory(String cateName);

    News[] findHotNews();

    News[] findByViewCountDesc();

    News findByIdNews(String idNews);
}
