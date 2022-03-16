package ru.netology.manager;

import ru.netology.domain.Film;

public class ManagerFilms {

    private int filmsNumber;
    private Film[] items = new Film[0];

    // конструктор с параметром
    public ManagerFilms(int filmsNumber) {
        this.filmsNumber = filmsNumber;
    }


    // конструктор без параметра
    public ManagerFilms() {
        this.filmsNumber = 10;
    }


//добавить фильм

    public void save(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

//        Выдать последние 10 добавленных фильмов* (фильмы выдаются в обратном порядке,
//        т.е. первым в массиве результатов будет тот, который был добавлен последним).

    public Film[] findLast() {
        int resultLength;
        if (items.length > filmsNumber) {
            resultLength = filmsNumber;
        } else {
            resultLength = items.length;
        }
        Film[] result = new Film[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index =items.length- i - 1;
            result[i] = items[index];
        }
        return result;
    }


}
