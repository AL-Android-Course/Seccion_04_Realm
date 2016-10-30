package com.alejandrolora.seccion_04_realm.models;

import com.alejandrolora.seccion_04_realm.app.MyApplication;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Alejandro on 25/9/16.
 */

public class Board extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String title;
    @Required
    private Date createdAt;

    private RealmList<Note> notes;


    public Board() {

    }

    public Board(String title) {
        this.id = MyApplication.BoardID.incrementAndGet();
        this.title = title;
        this.createdAt = new Date();
        this.notes = new RealmList<Note>();
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public RealmList<Note> getNotes() {
        return notes;
    }

}
