package org.launchcode;

public abstract class Disc {

    private Boolean isDirty;

    private Boolean isFull;

    public abstract void addData(String bonus);

    public abstract void removeData();

    public Disc(Boolean isDirty, Boolean isFull) {
        this.isDirty = isDirty;
        this.isFull = isFull;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public Boolean getFull() {
        return isFull;
    }

    public void setFull(Boolean full) {
        isFull = full;
    }
}
