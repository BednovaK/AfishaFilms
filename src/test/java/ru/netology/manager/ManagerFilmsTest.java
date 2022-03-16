package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmsTest {


    Film first = new Film(1, "Бладшот", "боевик");
    Film second = new Film(2, "Вперёд", "мультфильм");
    Film third = new Film(3, "Отель", "комедия");
    Film fourth = new Film(4, "Джентельмены", "боевик");
    Film fifth = new Film(5, "Человек", "ужасы");
    Film sixth = new Film(6, "Тролли", "мультфильм");
    Film seventh = new Film(7, "Валли", "мультфильм");
    Film eighth = new Film(8, "Звонок", "ужасы");
    Film ninth = new Film(9, "Номер один", "комедия");
    Film tenth = new Film(10, "Мама", "боевик");

    @Test
    public void shouldAddNewFilm() {
        ManagerFilms manager = new ManagerFilms();
        manager.save(first);
        manager.save(second);


        manager.save(third);

        Film[] expected = new Film[]{third, second, first};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {
        ManagerFilms manager = new ManagerFilms();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        manager.save(fourth);


        Film[] expected = new Film[]{fourth, third, second, first};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver() {
        ManagerFilms manager = new ManagerFilms(9);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);


        Film[] expected = new Film[]{tenth,ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }
}

