package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students(){//nullary constructor
    }
    public static Students getInstance(){
        return INSTANCE;
    }
}

