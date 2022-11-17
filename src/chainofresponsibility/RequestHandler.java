package chainofresponsibility;

public interface RequestHandler {
    String name();

    int getPriority();

    void handle(Request request);

    boolean canHandlerRequest(Request request);

}
