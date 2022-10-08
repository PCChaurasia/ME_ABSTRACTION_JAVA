package pl_java.interface_.exercise_1;

import pl_java.interface_.exercise_1.payment.DebitCard;
import pl_java.interface_.exercise_1.payment.NetBanking;
import pl_java.interface_.exercise_1.payment.Paytm;
import pl_java.interface_.exercise_1.payment.UPI;

public class Payment{
    /*
    .
    .
    Rest of the payment methods
    .
    .
    */
    public void PayWithUPI(){
      UPI upiPay = new UPI();
      upiPay.payWithUPI();
    }
    public void PayWithDebitCard(){
      DebitCard debitCardPay = new DebitCard();
      debitCardPay.payWithDebitCard();
    }
    public void PayWithNetBanking(){
      NetBanking netBankingPay = new NetBanking();
      netBankingPay.payWithNetBanking();
    }
    public void PayWithPaytmWallet(){
      Paytm paytmPay = new Paytm();
      paytmPay.payWithPaytmWallet();
    }
  }
