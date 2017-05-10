package ml.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKEJU  FATAI on 2017-01-03.
 */
public class RowGroup {

    private int numberOfFeatures;

    private List<DataRow> dataRows = new ArrayList<>();

    public RowGroup(int numberOfFixtures){
        this.numberOfFeatures = numberOfFixtures;
    }

    public int getNumberOfFeatures(){
        return numberOfFeatures;
    }

    public void add(DataRow dataRow){
        dataRows.add(dataRow);
    }

}
