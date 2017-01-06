package com.exam.mapper;

import com.exam.pojo.Film;

public interface FilmMapper extends BaseMapper<Film>{
    
    int updateByFilmId(int filmId);
    
    int updateFilm(Film film);
    
    int insertFilm(Film film);
    
}
