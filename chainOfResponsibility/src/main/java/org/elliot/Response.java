package org.elliot;

import lombok.Data;

@Data
public class Response {

    private Boolean success=Boolean.FALSE;
    private Request request;
}
