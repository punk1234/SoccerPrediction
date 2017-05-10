package ml;

/**
 * Created by AKEJU  FATAI on 2017-01-04.
 */
public class Variable {

    private String name;

    private double value;

    private double power;

    public Variable(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getPower(){
        return power;
    }

    public void setPower(double power){
        this.power = power;
    }

}
