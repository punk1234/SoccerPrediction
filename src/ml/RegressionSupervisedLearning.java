package ml;

import ml.data.DataRow;

/**
 * Created by AKEJU  FATAI on 2017-01-03.
 */
public interface RegressionSupervisedLearning extends SupervisedLearning {

    public double predict(DataRow predictionData);

}
