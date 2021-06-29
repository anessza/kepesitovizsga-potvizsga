package hu.nive.ujratervezes.forest;

public class WhitebarkPine extends Tree {
    private String type;
    private int height;

    public WhitebarkPine(int height) {
        super(height);
        this.type = "WhitebarkPine";
    }

    public WhitebarkPine() {
        super(height);
        this.type = "WhitebarkPine";
    }

    public String getType() {
        return type;
    }

    @Override
    public void irrigate() {
        int height = this.getHeight() + 2;
    }

}
