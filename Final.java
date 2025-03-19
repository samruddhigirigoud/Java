package Main; //10 marks final keyword using classes method and variable

class Final1{
	final public void finalmethod1() {
		System.out.println("i am final method1");
	}
}
class Final2 extends Final1{
	public void finalmethod2() {
		System.out.println("i am final method2");
	}
}

public class Final {
	
	public static void main(String[] args) {
		int  a=100; //reassign is possible in only main method not in the another method
		a=200; //final means fixed ,cannot be assigned
		System.out.println("a value is:"+a);
		
		Final1 f=new Final1();
		f.finalmethod1();
		//Final2 f1=new Final2();
		f.finalmethod2();

	}

}
