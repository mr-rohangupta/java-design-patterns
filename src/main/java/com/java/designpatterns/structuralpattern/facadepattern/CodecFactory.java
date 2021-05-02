package com.java.designpatterns.structuralpattern.facadepattern;

import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.Codec;
import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.impl.MPEG4CompressionCodec;
import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.impl.MovCompressionCodec;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equalsIgnoreCase(".mp4")) {
            System.out.println("CodecFactory is extracting mpeg audio please wait ..");
            System.out.println("finish extracting audio of type " + type);
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory is extracting mov please wait ..");
            System.out.println("finish extracting audio of type " + type);
            return new MovCompressionCodec();
        }
    }
}
