package differentiation;

/**
 * Created by AKEJU  FATAI on 2017-01-06.
 */
public class VariableFormat implements LexemeFormat {

    @Override
    public boolean valid(String input) {
        for(int i = 0; i < input.length(); i++){
            char value = input.charAt(i);
            if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')){
                //do nothing
            }
            else{
                return false;
            }
        }
        return true;
    }
}
