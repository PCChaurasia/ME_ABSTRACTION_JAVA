package pl_java.interface_.exercise_3.rule;

// TODO 
// inherit from the GameRule interface 
// Overide and implement the calculateResult method as per the mentioned rule.
public class MaxRule implements GameRule{

    public int calculateResult(int[] input){
        int max = 0;
          for(int i: input) {
              if (i > max) {
                  max = i;
              }
          }
          return max;
     }  
  

    //This rule returns an item with max value present in the input array.
    public String toString(){
          return "MaxRule"; 
      }
}
