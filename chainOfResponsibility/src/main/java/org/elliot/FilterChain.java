package org.elliot;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private final List<Handler> filters = new ArrayList<>();

    public void addFilter(Handler handler) {
        filters.add(handler);
    }

    public void removeFilter(Handler handler) {
        filters.remove(handler);
    }

    public Response process(Request request) {
        Response response = new Response();
        Boolean hasHandled = Boolean.FALSE;
        for (Handler handler : filters) {
            handler.handle(request, response);
            if(Boolean.TRUE.equals(response.getSuccess())){
                hasHandled = Boolean.TRUE;
                break;
            }
        }
        if(!hasHandled){
            System.out.println("未被任何一个处理");
        }

        return response;
    }
}
