package com.exam.pojo;

import java.util.Date;

public class FilmActor{
    
    private Short actorId;

    private Short filmId;
    
    
    private Date lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}