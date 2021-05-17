package com.java.designpatterns.behavioralpattern.mementopattern;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 16:03
 */
public final class PaintMemento {

    private final long id;
    private final String paintingName;
    private final String comment;

    public PaintMemento(long id, String paintingName, String comment) {
        this.id = id;
        this.paintingName = paintingName;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public String getPaintingName() {
        return paintingName;
    }

    public String getComment() {
        return comment;
    }
}
