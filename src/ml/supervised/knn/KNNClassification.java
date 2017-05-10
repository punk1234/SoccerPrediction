package ml.supervised.knn;

import ml.ClassificationSupervisedLearning;
import ml.data.DataRow;
import ml.data.DataTable;

/**
 * Created by AKEJU  FATAI on 2017-02-27.
 */
public class KNNClassification implements ClassificationSupervisedLearning {

    private int kValue;

    private DataTable dataTable;

    public KNNClassification(int kValue){

        this.kValue = kValue;

    }

    @Override
    public void learn(DataTable trainingSet) {

        this.dataTable = trainingSet;

    }

    @Override
    public int predict(DataRow predictionData) {
        return 0;
    }

    public double getEucledianDistance(DataRow row1, DataRow row2){

        double sumOfSquares = 0;

        for(String feature : row2.ge){

        }

    }
}
