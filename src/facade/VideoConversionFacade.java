package facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName,format);
        Type sourceType = TypeFactory.extract(file);
        Type destinationType;
        if (format.equals("mp4")) {
            destinationType = new MP4Compression();
        } else {
            destinationType = new OggCompression();
        }
        VideoFile buffer = BitrateReader.read(file, sourceType);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationType);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}