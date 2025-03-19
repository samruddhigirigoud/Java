package Main;
interface emp{
	abstract void disp();
}
class id implements emp{
	public void disp() {
		System.out.println("emp id is:101");
		System.out.println("emp name is:divya");
		System.out.println("emp salary is:100000");
		System.out.println("emp location is:bengalore");
		System.out.println("emp phone no is:36755737");
  }
}1
public class Empdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		id i=new id();
		i.disp();

	}

}
