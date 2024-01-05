package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Jingle Bells");
        songs.add("Frosty the Snowman");
        songs.add("Rocking Around the Christmas Tree");


        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD(false, true, songs, false);
        DVD myDvd = new DVD(false, true, false, "Home Alone", 1.43);


        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();
        CD copyCd = myCd.copyDisc();
        System.out.println(copyCd.getIsfake());
    }
}