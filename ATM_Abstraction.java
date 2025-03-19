package mypackage;
import java.util.Scanner;

abstract class ATM{   //parent class
	double balance;
	
	ATM(double balance){  //Parent Constructor
		this.balance = balance;
	}
	
	    abstract void withDraw(double amount);
	    abstract void deposit(double amount);
	    abstract void checkBal();

}

class SBI extends ATM{   //child class
	SBI(double balance){
		super(balance);
	}
	
	//WithDraw method
	void withDraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withrawl Success, Avl balance: "+ balance);
		}else {
			System.out.println("Balance is not Avl");
		}
	}
	//Deposit Method
	
	void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit Sucess: Avl Balance"+balance);
		}else {
			System.out.println("Invalid amount");
		}
	}
	//Checkbal
	void checkBal() {
		System.out.println("Current BAlance: "+balance);
	}
}

public class ATM_Abstraction {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		SBI obj = new SBI(1000);  //Intial amount
		
		while(true) {
			System.out.println("----ATM  MENU-----");
			System.out.println("1.WithDraw Money");
			System.out.println("2.Deposit Money");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("------------------");
			
			System.out.println("Enter Your Choice");
			
			int choice = s.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter amount to withDraw:");
				double with_amt = s.nextDouble();
				obj.withDraw(with_amt);
				break;
			case 2: 
				System.out.println("Enter amount to deposit:");
				double depo_amt = s.nextDouble();
				obj.deposit(depo_amt);
				break;
			case 3:
				System.out.println("Avl balance:");
				obj.checkBal();
				break;
			case 4:
				System.out.println("Thanku for using SBI ATM..!!");
				s.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid Choice..");
			}
			
		}
	}

}
