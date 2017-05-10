package differentiation;

/**
 * Created by AKEJU  FATAI on 2017-01-06.
 */
public class NumberFormat implements LexemeFormat {

    @Override
    public boolean valid(String input) {
        boolean hasDot = false;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                continue;
            }
            if(input.charAt(i) == '.'){
                if(hasDot){
                    return false;
                }
            }
        }
        return false;
    }
}
