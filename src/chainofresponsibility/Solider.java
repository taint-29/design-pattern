package chainofresponsibility;

public class Solider implements RequestHandler{

    @Override
    public String name() {
        return "Solider";
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request request) {
        request.markHanded();
        System.out.println(name() + " handling request: " + request);
    }

    @Override
    public boolean canHandlerRequest(Request request) {
        return request.getRequestType().equals(RequestType.TORTURE_PRISONER);
    }
}
