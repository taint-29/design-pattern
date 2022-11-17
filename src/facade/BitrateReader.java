package facade;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Type type) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Type type) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}