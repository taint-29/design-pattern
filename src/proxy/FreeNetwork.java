package proxy;

public class FreeNetwork implements NetworkClient{
    @Override
    public String call(String url) {
        return "It's response from url: " + url;
    }
}
