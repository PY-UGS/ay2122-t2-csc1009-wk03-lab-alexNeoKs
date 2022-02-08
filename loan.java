import java.util.*;

public class loan {
    double annualInterestRate = 2.5;
    int numberOfYears = 1;
    double loanAmount = 1000;
    Date loanDate = new Date();


    public void getAnnualInterestRate() {
        System.out.println(annualInterestRate);
    }

    public void getnumberOfYears() {
        System.out.println(numberOfYears);
    }

    public void getloanAmount(){
        System.out.println(loanAmount);
    }

    public void getloanDate(){
        System.out.println(loanDate.toString());
    }
    
    public void setAnnualInterestRate(double value) {
        annualInterestRate = value;
    }

    public void setnumberOfYears(int value) {
        numberOfYears = value;
    }

    public void setloanAmount(double value){
        loanAmount = value;
    }

    public double monthlyPayment() {
        double monthly_Rate = (this.annualInterestRate/100)/12;
        int terminmonths = this.numberOfYears *12;
        double monthly_Payment = (loanAmount*monthly_Rate) / (1 - Math.pow(1+monthly_Rate, -terminmonths) );

        //(loanAmount*annualInterestRate) / 1 - (1 / Math.pow(1+annualInterestRate,numberOfYears*12) );
        
        return monthly_Payment;
    }

    public double totalPayment(double monthly_Payment){
        double total_Payment = monthly_Payment * this.numberOfYears * 12;
        return total_Payment;

    }
}
