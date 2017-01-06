package com.exam.service;

import java.util.List;

import com.exam.pojo.Film;

public interface FilmService {

    boolean addFilm(Film film);

    boolean deleteFilm(int filmId);

    boolean updateFilm(Film film);

    List<Film> getAllFilm();

}
