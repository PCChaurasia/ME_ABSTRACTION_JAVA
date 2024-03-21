package pl_java.interface_.exercise_3;

import pl_java.interface_.exercise_3.rule.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values){
        this.values = values;
    }
    
    //TODO
    // Implement this method
    // find the rule that produces the largest result.
    public GameRule findBest(GameRule[] rules){
        //TODO
        int bestValue = 0;
        GameRule bestRule = null;
        for (GameRule r : rules) {
            int tmpVal = r.calculateResult(values);
            if (tmpVal > bestValue) {
                bestValue = tmpVal;
                bestRule = r;
            }
        }       
        return bestRule;

    }
}
