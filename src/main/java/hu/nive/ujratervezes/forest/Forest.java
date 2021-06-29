package hu.nive.ujratervezes.forest;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void rain() {
        for (Tree item : trees) {
            item.irrigate();
        }
    }

    public void cutTrees(Lumberjack lumberjack){

        int j = trees.size()-1;

        for( int i = j; i > -1; i-- )
        {
            if(lumberjack.canCut(trees.get(i)))
            {
                trees.remove(i);
            }
        }
    }

    public boolean isEmpty(){
        boolean igaz = false;
        if (this.trees.size() == 0) {
            igaz = true;
        }
        return igaz;
    }

    List<String> getStatus(){
        List<String> treesStatusList = new ArrayList<>();
        for (Tree tree: trees) {
            String item = "There is a " + tree.getHeight() + " tall " + tree.getType() + " in the forest.";
            treesStatusList.add(item);
            }
        return treesStatusList;
    }

}
