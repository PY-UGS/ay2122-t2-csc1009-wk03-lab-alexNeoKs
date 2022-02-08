import java.util.*;

public class Main {
    public static void main(String[] args){
        loan myObj = new loan();
        String s;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example 8.5: ");
        s = input.nextLine();
        myObj.setAnnualInterestRate(Float.parseFloat(s));

        System.out.println("Enter number of years as an integer: ");
        s = input.nextLine();
        myObj.setnumberOfYears(Integer.parseInt(s));
        
        System.out.println("Enter loan amount, for example, 120000.95: ");
        s = input.nextLine();
        myObj.setloanAmount(Float.parseFloat(s));

        System.out.print("The loan was created on ");
        myObj.getloanDate();

        System.out.format("The monthly payment is %.2f%n", myObj.monthlyPayment());
        

        System.out.format("The total payment is  %.2f%n", myObj.totalPayment(myObj.monthlyPayment()));
        

        input.close();
    }
}
        