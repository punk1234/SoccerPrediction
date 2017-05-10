package ml.data;

import ml.Variable;

import java.util.List;

/**
 * Created by AKEJU  FATAI on 2017-01-04.
 */
public class Unit {

    private double coefficient;

    private List<Variable> variables;

    public Unit(){

    }

    public Unit(double coefficient, List<Variable> variables){
        this.coefficient = coefficient;
        this.variables = variables;
    }

    public void setCoefficient(double coefficient){
        this.coefficient = coefficient;
    }

    public double getCoefficient(){
        return coefficient;
    }

    public void setVariables(List<Variable> variables){
        this.variables = variables;
    }

    public List<Variable> getVariables(){
        return variables;
    }

}
