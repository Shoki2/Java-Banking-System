package Account;
import java.time.LocalDate;

import java.util.Date;

public interface FixedSavings {
	public double balance = 200000;
    double interestRate = 7.5/100;//monthly
    public LocalDate maturityDate = LocalDate.of(2021, 12, 01);
    public double monthlyDeposit = 10000;
	
    public static void trackMoney() {
    	LocalDate today = LocalDate.now();
    	if(today.getDayOfMonth()==01) {
    		double addRate=balance*7.5/100 + balance;
    		System.out.println("Balance :"+addRate +'\n'+interestRate +" has been added");
    	}
    	else {
    		System.out.println("Balance "+balance);
    	}
    }

}
