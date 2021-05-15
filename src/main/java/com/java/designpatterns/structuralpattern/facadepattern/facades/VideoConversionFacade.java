package com.java.designpatterns.structuralpattern.facadepattern.facades;

import com.java.designpatterns.structuralpattern.facadepattern.AudioSoundMixer;
import com.java.designpatterns.structuralpattern.facadepattern.BitrateReader;
import com.java.designpatterns.structuralpattern.facadepattern.CodecFactory;
import com.java.designpatterns.structuralpattern.facadepattern.VideoFile;
import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.Codec;
import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.impl.MPEG4CompressionCodec;
import com.java.designpatterns.structuralpattern.facadepattern.interfacesandabstracts.impl.MovCompressionCodec;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("Conversion Process is started ..");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equalsIgnoreCase(".mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new MovCompressionCodec();
        }
        VideoFile bufferedStream = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateBufferStream = BitrateReader.convert(bufferedStream, destinationCodec);
        File result = new AudioSoundMixer().fix(intermediateBufferStream);
        System.out.println("Video Conversion Facade has completed conversion ..");
        return result;
    }
}
