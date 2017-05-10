package ml.supervised.linearmodel.gradientdescent;

import ml.data.DataTable;
import ml.supervised.linearmodel.Polynomial.Polynomial;

/**
 * Created by AKEJU  FATAI on 2017-04-02.
 */
public interface GradientDescent {

    Polynomial execute(DataTable trainingSet);

}
