package savingspackagr;

public class SavingsAccount {
private static double annualInterestRate;
private double savingBalance;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*double savingsBalance=1;
   ensemble(savingsBalance);*/
    
		//^This is sort of how I started but I had  a lot of trouble 
		//getting it to work so I switched tactics.
	}
public SavingsAccount() {
	//I think this is needed, Newboston video had something similar
	//an empty method that was the namesake of the class need to look into signifiance
	
}
public SavingsAccount(double x) {
	this.savingBalance=x;//x represents the value input from the other program e.g 2000 or 3000
}
public double getSavingBalance() {
	return this.savingBalance;
}
	public static void modifyInterestRate(double inputrate) {
		annualInterestRate=inputrate/100;//inputrate is the Interest rate input in the test program
	}
	public void calculateMonthlyInterest() {
		double x;//This is supposed to be the value of the monthly interest
		x=(this.savingBalance*annualInterestRate);
		x/=12;
		this.savingBalance+=x;
	}
	/*public static void ensemble(double x) {
		
		System.out.println(modifyInterestRate(x));//This doesn't work that well scrap it
	}*/
	
	
	
	
	
	
}
