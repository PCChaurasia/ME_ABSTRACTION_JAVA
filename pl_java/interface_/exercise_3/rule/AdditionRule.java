package pl_java.interface_.exercise_3.rule;

// TODO 
// inherit from the GameRule interface 
// Overide and implement the calculateResult method as per the mentioned rule.
public class AdditionRule  implements GameRule{

	public int calculateResult(int[] input) {
        //TODO
        int result = 0;
         for(int i: input) {
           result = result+i;
         }
         return result;
     
    } 


// This rule adds all the items in the input array and returns the final result.
  public String toString() {
		return "AdditionRule"; 
	}
}
