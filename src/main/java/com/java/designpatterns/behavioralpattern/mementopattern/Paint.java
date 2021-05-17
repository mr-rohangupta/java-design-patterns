package com.java.designpatterns.behavioralpattern.mementopattern;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 15:58
 */
public class Paint {
    private long id;
    private String paintingName;
    private String comment;

    public Paint(long id, String paintingName) {
        this.id = id;
        this.paintingName = paintingName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPaintingName() {
        return paintingName;
    }

    public void setPaintingName(String paintingName) {
        this.paintingName = paintingName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public PaintMemento createMemento() {
        PaintMemento paintMemento = new PaintMemento(id, paintingName, comment);
        return paintMemento;
    }

    public void restore(PaintMemento paintMemento) {
        this.id = paintMemento.getId();
        this.paintingName = paintMemento.getPaintingName();
        this.comment = paintMemento.getComment();
    }

    @Override
    public String toString() {
        return "Paint [id = " + id + ", PaintingName = " + paintingName + "Comment = " + comment + "]";
    }
}
