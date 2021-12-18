package Lab02;
import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
		
	}
public Account(int id,double balance ){
	
	this.id = id;
    this.balance = balance;
    dateCreated = new Date();
    
	
}
public int getId() {
	return this.id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return this.balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Date getDateCreated() {
	return this.dateCreated;
}
public void withdraw(double takeMoney){

    this.balance = balance - takeMoney;

}



public void deposit(double addMoney){

    this.balance = balance + addMoney;

}




}
