package chainofresponsibility;

public class Commander implements RequestHandler{

    @Override
    public String name() {
        return "Commander";
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request request) {
        request.markHanded();
        System.out.println(name() + " handling request :" + request);
    }

    @Override
    public boolean canHandlerRequest(Request request) {
        return request.getRequestType().equals(RequestType.DEFEND_CASTLE);
    }
}
