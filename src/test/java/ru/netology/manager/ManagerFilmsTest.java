package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmsTest {

    Films first = new Films(1, "Бладшот", "боевик");
    Films second = new Films(2, "Вперёд", "мультфильм");
    Films third = new Films(3, "Отель", "комедия");
    Films fourth = new Films(4, "Джентельмены", "боевик");
    Films fifth = new Films(5, "Человек", "ужасы");
    Films sixth = new Films(6, "Тролли", "мультфильм");
    Films seventh = new Films(7, "Валли", "мультфильм");
    Films eighth = new Films(8, "Звонок", "ужасы");
    Films ninth = new Films(9, "Номер один", "комедия");
    Films tenth = new Films(10, "Мама", "боевик");

    @Test
    public void shouldAddNewFilm() {
        ManagerFilms manager = new ManagerFilms();
        manager.save(first);
        manager.save(second);


        manager.save(third);

        Films[] expected = new Films[]{first, second, third};
        Films[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {
        ManagerFilms manager = new ManagerFilms(3);
        manager.save(first);
        manager.save(second);
        manager.save(third);

        manager.save(fourth);


        Films[] expected = new Films[]{third, second, first};
        Films[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver() {
        ManagerFilms manager = new ManagerFilms(12);
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


        manager.findLast();


        Films[] expected = new Films[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third, second, first};
        Films[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddNewFilmO() {
        ManagerFilms manager = new ManagerFilms(2);
        manager.save(first);
        manager.save(second);


        manager.save(third);

        Films[] expected = new Films[]{second,first};
        Films[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }
}

