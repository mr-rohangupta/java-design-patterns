package com.java.designpatterns.structuralpattern.facadepattern;

import java.io.File;

public class AudioSoundMixer {
    public File fix(VideoFile file) {
        System.out.println("Audio mixer is fixing your audio please wait..");
        System.out.println("Finish mixing audio ..");
        return new File("temporaryFile");
    }
}
