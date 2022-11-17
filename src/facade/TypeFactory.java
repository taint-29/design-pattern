package facade;

public class TypeFactory {
    public static Type extract(VideoFile file) {
        String type = file.getCodeType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MP4Compression();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompression();
        }
    }
}
