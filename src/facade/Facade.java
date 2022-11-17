package facade;

import java.io.File;

public class Facade {

    /**
     * * The Facade design pattern is often used when a system is very complex or difficult to understand
     *  * because the system has a large number of interdependent classes or its source code is
     *  * unavailable. This pattern hides the complexities of the larger system and provides a simpler
     *  * interface to the client. It typically involves a single wrapper class which contains a set of
     *  * members required by client. These members access the system on behalf of the facade client and
     *  * hide the implementation details.
     * @param args
     */

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
