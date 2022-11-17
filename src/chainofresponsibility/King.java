package chainofresponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class King {
    private List<RequestHandler> handlers;

    public King(){
        buildChain();
    }

    private void buildChain(){
        handlers = Arrays.asList(new Commander(), new Officer(), new Solider());
    }

    public void makeRequest(Request request){
        handlers
                .stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handle -> handle.canHandlerRequest(request))
                .findFirst()
                .ifPresent(handle -> handle.handle(request));
    }
}
