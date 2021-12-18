package ex3;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Account ob1 = new Account();
		ob1.id = 1122;
		ob1.balance = 20000;
		
	}

}
class Account{
private int id;
private double balance;
private Date dateCreated;
Account(){
	dateCreated = new Date();	
}
Account(int id,double balance ){
	
	this.id = id;
    this.balance = balance;	
	
}
public int getId(int id ) {
    return this.id;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getBalance(double balance) {
    return this.balance;
}
withdraw (){

    

}
deposit (){
    

}






	
}
