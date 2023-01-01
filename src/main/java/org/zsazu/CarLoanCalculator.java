package org.zsazu;

public class CarLoanCalculator {
    CarLoanCalculator(int loanAmount, int loanLength, int loanRate, int downPayment) throws Exception {
        if(loanLength<=0 || loanRate <=0){
            throw new Exception("Length of loan is too short or interest rate is too low!");
        }
        else if(downPayment >= loanAmount){
            throw new Exception("Your down payment is enough to cover the cost of the car!");
        }
        else{
            int remainingBalance = loanAmount - downPayment;
            int months = loanLength*12;
            int monthlyBalance = remainingBalance/months;
            int interest = monthlyBalance*loanRate/100;
            int monthlyPayment = monthlyBalance+interest;
            System.out.println(monthlyPayment);

        }
    }
}
