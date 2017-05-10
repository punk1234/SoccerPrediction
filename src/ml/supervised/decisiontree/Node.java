package ml.supervised.decisiontree;

import java.util.List;
import java.util.Map;

/**
 * Created by AKEJU  FATAI on 2017-03-27.
 */
public class Node {

    private String featureName;
    private Map<String,Node> childrenNodes;

    public Node(String featureName){

        this.featureName = featureName;

    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Map<String, Node> getChildrenNodes() {
        return childrenNodes;
    }

    public void setChildrenNodes(Map<String, Node> childrenNodes) {
        this.childrenNodes = childrenNodes;
    }
}
