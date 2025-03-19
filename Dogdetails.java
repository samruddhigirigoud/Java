package Main;
class name{
	public void dogname() {
		System.out.println("Dog name:Sheru");
	}
}
class breed{
	public void dogbreed() {
		System.out.println("Dog Breed:Lab");
	}
}
class price{
	public void dogprice() {
		System.out.println("Dog Price:50000");
	}
}
class loc{
	public void dogloc() {
		System.out.println("Dog Location:Japan");
	}
}
class owner{
	public void dogowner() {
		System.out.println("Dog Owener Details:Mr xyz");
	}
}

public class Dogdetails {

	public static void main(String[] args) {
		name obj=new name();
		obj.dogname();
	    breed obj1=new breed();
		obj1.dogbreed();
		price obj2=new price();
		obj2.dogprice();
		loc obj3=new loc();
		obj3.dogloc();
		owner obj4=new owner();
		obj4.dogowner();
	}

}
