package com.bopa;
@restcontroller
public class Welcome {
    @getmapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Bopa!";
    }
}