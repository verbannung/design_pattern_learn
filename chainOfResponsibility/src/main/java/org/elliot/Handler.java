package org.elliot;

public interface Handler {

    Boolean canHandle(Request request);

    void handle(Request request, Response response);
}
