package Main; //important 
import java.util.Scanner;
abstract class software{
	String name;
	String pass;
	void userinput() {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter user name");
        name=sc.nextLine();
        System.out.println("enter password");
        pass=sc.nextLine();
        
	}
	void userlogin() {
		System.out.println("welcome to instagram");
		System.out.println("pleaselogin here");
	}
	
	abstract void open();
}
class instagram extends software{
	@Override
	void open() {
		while(true) {
		
		if(name.equals("divya") && pass.equals("1234")) {
			System.out.println("successfully login,app is open");
			break;
		}
		else {
			System.out.println("username and password is wrong,please try again");
			userinput();
		}
		}	
		
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        instagram i=new instagram();
        i.userlogin();
        i.userinput();
        i.open();
	}

}
