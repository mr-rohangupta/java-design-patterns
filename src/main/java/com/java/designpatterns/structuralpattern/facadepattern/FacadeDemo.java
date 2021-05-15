package com.java.designpatterns.structuralpattern.facadepattern;

import com.java.designpatterns.structuralpattern.facadepattern.facades.VideoConversionFacade;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        File file = videoConversionFacade.convertVideo("video.mov", "mp4");
        System.out.println("Complete .." + file);
    }
}
