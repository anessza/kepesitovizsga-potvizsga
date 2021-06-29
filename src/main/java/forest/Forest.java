package hu.nive.ujratervezes.forest;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> trees = new ArrayList<>();

    public void rain() {
        for (Tree tree: trees) {
            tree.irrigate();
        }
    }

    public List<Tree> cutTrees(Lumberjack lumberjack){
        List<Tree> treesAfterCut = new ArrayList<>();
        for (Tree tree: trees) {
            if (lumberjack.canCut(tree) == false) {
                treesAfterCut.add(tree);
            }
        }
        return treesAfterCut;
    }

    public boolean isEmpty(){
        if (this.trees.size() == 0) {
            boolean igaz = true;
        }
        return true;
    }

    List<String> getStatus(){
        List<String> treesStatusList = new ArrayList<>();
        for (Tree tree: trees) {
            String item = "There is a " + tree.getHeight() + "tall " + tree.getType() + ".";
            treesStatusList.add(item);
            }
        return treesStatusList;
    }

//    public InsnList getTrees() {
//    }
}
