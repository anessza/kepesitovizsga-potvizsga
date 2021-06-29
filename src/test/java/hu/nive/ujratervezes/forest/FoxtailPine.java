package hu.nive.ujratervezes.forest;

public class FoxtailPine extends Tree {
    private String type;
    private int height;

    public FoxtailPine(int height) {
        super(height);
        this.type = "FoxtailPine";
    }

    public FoxtailPine() {
        super(height);
        this.type = "FoxtailPine";
    }


    @Override
    public void irrigate() {
        int height = this.getHeight() + 2;
    }

}
