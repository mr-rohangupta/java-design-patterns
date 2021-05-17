package com.java.designpatterns.behavioralpattern.mementopattern;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 16:35
 */
public class MementoDemo {
    public static void main(String[] args) {
        Paint paint = new Paint(1, "Monalisa Painting");
        paint.setComment("Awesome Painting..");
        System.out.println(paint);

        PaintMemento paintMemento = paint.createMemento();
        paint.setComment("Very Good Painting");
        System.out.println(paint);

        paint.restore(paintMemento);
        System.out.println(paint);
    }
}
