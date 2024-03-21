package pl_java.interface_.exercise_1.payment;

public class UPI implements Payable {
    /*
  .
  .
  Rest of the methods
  .
  .
  */
  // public void payWithUPI(){
  //   System.out.println("Paid successfully using UPI");
  // }

  @Override
  public void pay() {
    
    System.out.println("Paid successfully using UPI");
    
  } 
}
