package com.tematihonov;

public class Main {

    public static void main(String[] args) {
	    CinemaCardBuilder ccb = new CinemaCardBuilder();
	    ccb.name().author().qtyPage().year().description().mainRoles().longOfCinema().build();
	    
    }
}
