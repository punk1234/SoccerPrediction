package ml.data;

/**
 * Created by AKEJU  FATAI on 2017-01-03.
 */
public class DataItem {

    private String featureName;

    private double value;

    public DataItem(String featureName, double value){
        this.featureName = featureName;
        this.value = value;
    }

    public void setFeatureName(String featureName){
        this.featureName = featureName;
    }

    public String getFeatureName(){
        return featureName;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

}
