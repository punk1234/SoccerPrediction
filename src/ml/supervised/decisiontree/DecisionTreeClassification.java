package ml.supervised.decisiontree;

import ml.ClassificationSupervisedLearning;
import ml.data.DataRow;
import ml.data.DataTable;

/**
 * Created by AKEJU  FATAI on 2017-02-27.
 */
public class DecisionTreeClassification implements ClassificationSupervisedLearning {

    private DecisionTree decisionTree;

    @Override
    public int predict(DataRow predictionData) {
        return 0;
    }

    @Override
    public void learn(DataTable trainingSet) {

        this.decisionTree = DecisionTreeBuilder.build(trainingSet);

    }
}
