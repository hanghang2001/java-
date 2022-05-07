package collection;

import java.util.ArrayList;
import java.util.Collection;

public class object {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《你好，李焕英》",9.5,"张小斐，贾玲，沈腾，陈赫"));
        movies.add(new Movie("《唐人街探案》",8.5,"王宝强，刘昊然"));
        movies.add(new Movie("《刺杀小说家》",8.6,"雷佳音，杨幂"));

        for (Movie movie : movies) {
            System.out.println("片名：" + movie.getNeme());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }
    }
}
