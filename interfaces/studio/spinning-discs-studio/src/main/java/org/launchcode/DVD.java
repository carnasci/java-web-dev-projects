package org.launchcode;

import java.util.ArrayList;

public class DVD extends Disc implements Loadable, Spinnable {

    private boolean isBluray;

    private String title;

    private Double runTime;

    private ArrayList<String> bonusFeatures = new ArrayList<>();

    public DVD(Boolean isDirty, Boolean isFull, Boolean isBluray, String title, Double runTime) {
        super(isDirty, isFull);
        this.isBluray = isBluray;
        this.title = title;
        this.runTime = runTime;
    }
    @Override
    public void addData(String bonus) {
        if (!this.getFull()) {
            bonusFeatures.add(bonus);
        } else {
            System.out.println("No Room Left!");
        }

    }

    @Override
    public void removeData() {

    }

    @Override
    public void playDisc() {

    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is now spinning in a public DVD player. Be Careful!");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
