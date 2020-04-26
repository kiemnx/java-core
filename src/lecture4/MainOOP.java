package lecture4;

import java.util.List;
import java.util.Scanner;

public class MainOOP {


    public static void main(String[] args){

        News[] news = new News[10];

        NewsService newsService = new NewsService();

        newsService.insertIntoDatabase(news[0]);

        List<News> result = newsService.findByCategory(0, news);


    }
}
