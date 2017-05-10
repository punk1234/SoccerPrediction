package ml;

import ml.data.Unit;

import java.util.List;

/**
 * Created by AKEJU  FATAI on 2017-01-04.
 */
public class Equation {

    private List<Unit> units;

    public Equation(List<Unit> units){
        this.units = units;
    }

    public void setUnits(List<Unit> units){
        this.units = units;
    }

    public List<Unit> getUnits(){
        return units;
    }

}
