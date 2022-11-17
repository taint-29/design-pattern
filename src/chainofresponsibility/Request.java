package chainofresponsibility;

public class Request {

    /**
     * The type of this request, used by each item in the chain to see if they should or can handle
     * this particular request.
     */
    private RequestType requestType;

    private String description;

    /**
     * Indicates if the request is handled or not. A request can only switch state from unhandled to
     * handled, there's no way to 'unhandle' a request.
     */
    private boolean handled;

    public Request(RequestType requestType, String description) {
        this.requestType = requestType;
        this.description = description;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHandled() {
        return handled;
    }

    public void setHandled(boolean handled) {
        this.handled = handled;
    }

    public void markHanded(){
        this.handled = true;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
