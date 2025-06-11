package org.elliot;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Copy {

    <T> T deepCopy() throws JsonProcessingException;

}
