package com.exam.mapper;

import java.util.List;

public interface BaseMapper<T> {

    int deleteByFilmId(int filmId);
    
    List<T> selectAll();
}
