package com.java.designpatterns.structuralpattern.facadepattern;

import com.java.designpatterns.structuralpattern.facadepattern.facades.VideoConversionFacade;

import java.io.File;

public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        File file = videoConversionFacade.convertVideo("video.mov", "mp4");
        System.out.println("Complete .." + file);
    }
}
