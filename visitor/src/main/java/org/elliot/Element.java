package org.elliot;

public interface Element {

    void accept(Visitor visitor);
}
