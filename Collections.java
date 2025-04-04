package javasam;
import java.util.List;
import java.util.ArrayList;
public class Collections {
	public static void main(String args[]) {
		List<Integer>	numbers=new ArrayList<>();
		System.out.println("My numbers list before adding elements:"+numbers);
		numbers.add(100);
	    numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		System.out.println("My numbers list after adding elements:"+numbers);
		numbers.remove(2);
		System.out.println("My numbers list after removing elements:"+numbers);
//		List<String> fruits=new ArrayList<>();
//		System.out.println("My numbers list before adding elements:"+fruits);
//		fruits.add("Apple");
//		fruits.add("Orange");
//		fruits.add("Pineaaple");
//		fruits.add("Grapes");
//		fruits.add("Papaya");
//		System.out.println("My numbers list after adding elements:"+fruits);
//		fruits.remove(2);
//		System.out.println("My numbers list after removing elements:"+fruits);
		for(int num: numbers ) {
			System.out.println("My numbers list using iteration:"+numbers);
		}
	}
}
