package ml.supervised.linearmodel.Polynomial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKEJU  FATAI on 2017-04-02.
 */
public class Polynomial {

    private List<PUnit> pUnits;

    private double constant = 0;

    public Polynomial(){

        pUnits = new ArrayList<>();

    }

    public Polynomial(List<PUnit> pUnits){

        this.pUnits = pUnits;

    }

    public void add(PUnit unit){

        pUnits.add(unit);

    }

    public double getConstant(){
        return constant;
    }

    public void setConstant(double constant){
        this.constant = constant;
    }

}
