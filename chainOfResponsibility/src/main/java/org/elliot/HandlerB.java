package org.elliot;

public class HandlerB implements Handler{
    @Override
    public Boolean canHandle(Request request) {
        return 2==request.getType();
    }

    @Override
    public void handle(Request request, Response response) {
        if (canHandle(request)) {
            response.setSuccess(Boolean.TRUE);
            response.setRequest(request);
        }

    }
}
