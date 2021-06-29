package hu.nive.ujratervezes.forest;

public abstract class Tree {

    protected int height;
    protected String type;

    public Tree(int height) {
        this.height = height;
        this.type = type;
    }

    public Tree(String type) {
        this.height = 0;
        this.type = type;
    }

    public Tree() {
        this.height = 0;
    }
    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }


    abstract void irrigate();
}