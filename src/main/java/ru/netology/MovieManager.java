package ru.netology;

public class MovieManager {

    //переменная типа массив
    private String[] movies = new String[0];

    //переменная для отражения лимита
    private int limit;

    //У менеджера должно быть два конструктора
    //конструктор №1 (без параметров, выставляющий лимит менеджера в 10)
    //*Сделайте так, чтобы по умолчанию выводилось последние 10 добавленных фильмов
    public MovieManager() {
        this.limit = 10;
    }

    //конструктор №2 (с параметром, берущий значение лимита для менеджера из параметра конструктора)
    public MovieManager(int limit) {
        this.limit = limit;
    }

    //Менеджер должен уметь выполнять следующие операции:
    //Добавление нового фильма.
    //Вывод всех фильмов в порядке добавления (findAll).
    //Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке (findLast).


    //1 метод добавление нового фильма (addMovie)
    public void addMovie(String movie) {
        //создание нового массива tmp, который по размеру на единицу больше, чем старый
        String[] tmp = new String[movies.length + 1];

        //скопируем в новый массив все элементы из старого массива
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        //заполнение последней ячейки массива tmp
        tmp[tmp.length - 1] = movie;

        // переложим новый массив в старый
        movies = tmp;
    }


    //2 метод вывод всех фильмов в порядке добавления (findAll)
    public String[] findAll() {
        return movies;
    }


    //3. Метод вывода max лимита* последних добавленных фильмов в обратном от добавления порядке (findLast)
    public String[] findLast() {
        int resultLengtn;
        if (movies.length < limit) {
            resultLengtn = movies.length;
        } else {
            resultLengtn = limit;
        }
        String[] tmp = new String[resultLengtn];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}








