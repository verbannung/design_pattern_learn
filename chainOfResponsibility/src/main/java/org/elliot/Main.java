package org.elliot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HandlerA());
        filterChain.addFilter(new HandlerB());

        Request request = new Request();
        request.setType(10);
        filterChain.process(request);
    }
}