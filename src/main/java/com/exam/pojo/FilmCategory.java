package com.exam.pojo;

import java.util.Date;

public class FilmCategory  {
    
    private Short filmId;

    private Byte categoryId;
    private Date lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}