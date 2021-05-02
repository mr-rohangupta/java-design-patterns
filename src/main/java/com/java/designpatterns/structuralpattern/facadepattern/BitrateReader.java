package com.java.designpatterns.structuralpattern.facadepattern;

import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.Codec;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Bitrate Reader is reading file please wait ..");
        System.out.println("Finish reading bitrate ..");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Bitrate Writer is writing please wait ..");
        System.out.println("Finish writing bitrate ..");
        return buffer;
    }
}
