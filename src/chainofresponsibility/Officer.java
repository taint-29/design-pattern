package chainofresponsibility;

public class Officer implements RequestHandler{
    @Override
    public String name() {
        return "Officer";
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(Request request) {
        request.markHanded();
        System.out.println(name() + " handling request: " + request);
    }

    @Override
    public boolean canHandlerRequest(Request request) {
        return request.getRequestType().equals(RequestType.COLLECT_TAX);
    }
}
