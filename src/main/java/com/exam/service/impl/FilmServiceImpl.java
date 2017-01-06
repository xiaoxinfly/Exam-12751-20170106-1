package com.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.mapper.FilmActorMapper;
import com.exam.mapper.FilmCategoryMapper;
import com.exam.mapper.FilmMapper;
import com.exam.mapper.FilmTextMapper;
import com.exam.mapper.InventoryMapper;
import com.exam.mapper.RentalMapper;
import com.exam.pojo.Film;
import com.exam.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;
    @Autowired
    private FilmTextMapper filmTextMapper;
    @Autowired
    private FilmCategoryMapper filmCategoryMapper;
    @Autowired
    private FilmActorMapper filmActorMapper;
    @Autowired
    private RentalMapper rentalMapper;
    @Autowired
    private InventoryMapper inventoryMapper;

    @Override
    public boolean addFilm(Film film) {
        if (this.filmMapper.insertFilm(film) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteFilm(int filmId) {
        this.rentalMapper.deleteByFilmId(filmId);
        this.inventoryMapper.deleteByFilmId(filmId);
        this.filmCategoryMapper.deleteByFilmId(filmId);
        this.filmActorMapper.deleteByFilmId(filmId);
        this.filmTextMapper.deleteByFilmId(filmId);
        if (this.filmMapper.deleteByFilmId(filmId) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateFilm(Film film) {
        if (this.filmMapper.updateFilm(film) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Film> getAllFilm() {
        return this.filmMapper.selectAll();
    }

}
