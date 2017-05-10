package differentiation;

import java.util.List;

/**
 * Created by AKEJU  FATAI on 2017-01-06.
 */
public class OperatorFormat implements LexemeFormat {

    private List<String> operators;

    public OperatorFormat(List<String> operators){
        this.operators = operators;
    }

    @Override
    public boolean valid(String input) {
        for(int i=0; i < operators.size(); i++){
            if(input.equals(operators.get(i))){
                return true;
            }
        }
        return false;
    }
}
