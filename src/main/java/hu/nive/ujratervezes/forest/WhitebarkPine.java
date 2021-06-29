package hu.nive.ujratervezes.forest;

public class WhitebarkPine extends Tree {
    private String type;

    public WhitebarkPine(int height) {
        super(height);
        this.type = "WhitebarkPine";
    }

    public WhitebarkPine() {
        super();
        this.type = "WhitebarkPine";
    }

    public String getType() {
        return type;
    }

    @Override
    public void irrigate() {
      this.height = this.getHeight() + 2;
    }

}
