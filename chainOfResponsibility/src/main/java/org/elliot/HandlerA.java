package org.elliot;

public class HandlerA implements Handler {
    @Override
    public Boolean canHandle(Request request) {
        return 1==request.getType();
    }

    @Override
    public void handle(Request request, Response response) {
        if(canHandle(request)){
            System.out.println("Handle A成功处理了请求");
            response.setRequest(request);
            response.setSuccess(Boolean.TRUE);
        }
    }
}
