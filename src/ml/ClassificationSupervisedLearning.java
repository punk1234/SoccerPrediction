package ml;

import ml.data.DataRow;

/**
 * Created by AKEJU  FATAI on 2017-01-03.
 */
public interface ClassificationSupervisedLearning extends SupervisedLearning {

    public int predict(DataRow predictionData);

}
