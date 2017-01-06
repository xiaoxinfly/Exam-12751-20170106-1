package com.exam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.pojo.Film;
import com.exam.service.FilmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("/delete")
    @ResponseBody
    public boolean delete(int filmId) {
        return filmService.deleteFilm(filmId);
    }

    @RequestMapping("/update")
    @ResponseBody
    public boolean update(Film film) {
        return  filmService.updateFilm(film);
    }

    @RequestMapping("/add")
    @ResponseBody
    public boolean add(Film film) {
        return this.filmService.addFilm(film);
    }

    @RequestMapping("/all")
    @ResponseBody
    public Map<String,Object> getAll(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<Film> list = this.filmService.getAllFilm();
        PageInfo<Film> pageInfo = new PageInfo<Film>(list);
        Map<String,Object> map = new HashMap<String,Object>();
        long lastPage = pageInfo.getTotal()/rows;
        if(pageInfo.getTotal()%rows!=0){
            lastPage = lastPage + 1;
        }
        map.put("film", list);
        map.put("lastPage", lastPage);
        return map;
    }

}
