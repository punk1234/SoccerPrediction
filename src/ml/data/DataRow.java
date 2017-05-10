package ml.data;

/**
 * Created by AKEJU  FATAI on 2017-01-03.
 */
public class DataRow {

    private DataItem[] dataItems;

    public DataRow(int size){
        dataItems = new DataItem[size];
    }

    public DataItem getDataItemAtIndex(int index){
        return dataItems[index];
    }

    public DataItem getDataItemByFeatureName(String featureName){
        for(int i = 0; i < dataItems.length; i++){
            if(dataItems[i].getFeatureName() == featureName){
                return dataItems[i];
            }
        }
        return null;
    }

    public void setDataItemAtIndex(DataItem[] dataItems){
        this.dataItems = dataItems;
    }

    public int getSize(){
        return dataItems.length;
    }

}
