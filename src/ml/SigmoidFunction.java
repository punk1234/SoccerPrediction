package ml;

/**
 * Created by AKEJU  FATAI on 2017-01-06.
 */
public class SigmoidFunction {

    public static double pass(double value){
        double output = 1 / ( 1  + Math.exp(value));
        return output;
    }

}
