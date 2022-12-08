import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {

    @Test
    //тестируем метод addMovie
    public void test1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    //тестируем метод findLast
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    //тестируем лимит равны заявленному лимиту 10
    public void test3() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");
        manager.addMovie("Film8");
        manager.addMovie("Film9");
        manager.addMovie("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    //тестируем меньше заявленного лимита 10
    public void test4() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");
        manager.addMovie("Film8");
        manager.addMovie("Film9");

        String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
