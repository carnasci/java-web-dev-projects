package org.launchcode;

import java.util.ArrayList;

public class CD extends Disc implements Copyable, Loadable, Spinnable {

    ArrayList<String> songs = new ArrayList<>();

    private Boolean isfake;

    public CD(Boolean isDirty, Boolean isFull, ArrayList<String> songs, Boolean isfake) {
        super(isDirty, isFull);
        this.songs = songs;
        this.isfake = isfake;
    }
    @Override
    public CD copyDisc() {

        return new CD(this.getDirty(), this.getFull(), this.songs, true );

    }

    @Override
    public void addData() {

    }

    @Override
    public void removeData() {

    }

    @Override
    public void playDisc() {

    }

    @Override
    public void spinDisc() {
        System.out.println("CD is currently spinning in your Discman!");
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    public Boolean getIsfake() {
        return isfake;
    }

    public void setIsfake(Boolean isfake) {
        this.isfake = isfake;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
