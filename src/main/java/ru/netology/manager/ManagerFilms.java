package ru.netology.manager;

import ru.netology.domain.Films;

public class ManagerFilms {
    Films[] item;
    int filmsNumber;
    int index;

    // конструктор с параметром
    public ManagerFilms(int filmsNumber) {
        this.filmsNumber = filmsNumber;
         Films[] items = new Films[filmsNumber];
    }


    // конструктор без параметра, он вызывает конструктор с параметром 10
    public ManagerFilms() {
        this(10);
    }

    private Films[] items = new Films[0];


//добавить фильм

    public void save(Films item) {
        int length = items.length + 1;
        Films[] tmp = new Films[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

//        Выдать последние 10 добавленных фильмов* (фильмы выдаются в обратном порядке,
//        т.е. первым в массиве результатов будет тот, который был добавлен последним).

    public Films[] findAll() {
        return items;
    }

public Films[] findLast(){
        int resultLength;
        if (filmsNumber > 10) {
            resultLength = 10;
        } else {
            resultLength = filmsNumber;
        }
        Films[] result = new Films[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = items[index];
        }
        return result;
    }



}
