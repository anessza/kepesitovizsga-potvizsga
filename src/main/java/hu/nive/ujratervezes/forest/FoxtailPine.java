package hu.nive.ujratervezes.forest;

public class FoxtailPine extends Tree {
    private String type;

    public FoxtailPine(int height) {
        super(height);
        this.type = "FoxtailPine";
    }

    public FoxtailPine() {
        super();
        this.type = "FoxtailPine";
    }

    public String getType() {
        return type;
    }


    @Override
    public void irrigate() {
        this.height = this.getHeight() + 1;
    }

}
