package hu.nive.ujratervezes.forest;

public class Lumberjack {

    public Lumberjack() {
    }

    boolean canCut(Tree tree){
        return (tree.getHeight() > 4);
    }

}
