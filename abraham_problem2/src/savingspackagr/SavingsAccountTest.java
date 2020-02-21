package savingspackagr;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SavingsAccount saver1=new SavingsAccount(2000);
 SavingsAccount saver2=new SavingsAccount(3000);
 int b,i;
 SavingsAccount.modifyInterestRate(4);//Enter this as a percentage number e.g 4 percent or 3.5 as oppposed to .04 or .035
 System.out.println("Here is the balance sheet for Saver 1: 4% Interest Rate\n");
 for(i=1;i<=12;i++) {//This is the list for saver 1
	 saver1.calculateMonthlyInterest();
	 System.out.println("Month\t"+i+String.format("\t%2f",saver1.getSavingBalance()));
 }
 System.out.println("\nHere is the balance sheet for saver 2: 4% Interest Rate\n");
 for(i=1;i<=12;i++) {
	 saver2.calculateMonthlyInterest();
 System.out.println("Month\t"+i+String.format("\t%2f",saver2.getSavingBalance()));
 }
 
 SavingsAccount.modifyInterestRate(5);//from here just copy and paste the saver1 and saver 2 loops
 System.out.println("Here is new balance sheet for Saver 1: 5% Interest Rate\n");
 for(i=1;i<=12;i++) {//This is the list for saver 1
	 saver1.calculateMonthlyInterest();
	 System.out.println("Month\t"+i+String.format("\t%2f",saver1.getSavingBalance()));
 }
 System.out.println("\nHere is new balance sheet for Saver 1: 5% Interest Rate\\n");
 for(i=1;i<=12;i++) {
	 saver2.calculateMonthlyInterest();
 System.out.println("Month\t"+i+String.format("\t%2f",saver2.getSavingBalance()));
 }
 
 
	}

}
