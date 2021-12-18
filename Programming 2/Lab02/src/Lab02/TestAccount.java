package Lab02;


public class TestAccount {
	public static void main(String[] args) {
	Account account = new Account(1122,20000);
	account.withdraw(2500);
	account.deposit(3000);
	System.out.println("The Balance Is :  " + account.getBalance() + " S.R.");
	System.out.println("The Time of Date Created : " + account.getDateCreated() + "٠");
	}
	
	

}
