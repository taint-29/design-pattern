package builder;

public class Response {
    private int status;
    private String message;
    private int code;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Response(Builder builder) {
        this.status = builder.status;
        this.message = builder.message;
        this.code = builder.code;
        this.data = builder.data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    public static class Builder{
        // required message
        private int status;
        private int code;

        // optional message
        private String message;
        private Object data;

        /**
         * @param status status response from server. 1 if OK, 0 if not
         * @param code   code response from server. ex: 404,500,200
         */
        public Builder(int status, int code) {
            this.status = status;
            this.code = code;
        }

        /**
         * build message response from server
         *
         * @param message message from server
         * @return builder class
         */

        public Builder buildMessage(String message){
            this.message = message;
            return this;
        }

        /**
         * build data response from server
         *
         * @param data data response from server
         * @return builder class
         */
        public Builder buildData(Object data){
            this.data = data;
            return this;
        }

        public Response build(){
            return new Response(this);
        }

    }

}
