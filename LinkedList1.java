package javasam;
import java.util.List;
import java.util.LinkedList;
public class LinkedList1 {
	public static void main(String args[]) {
		List<String> heros=new LinkedList<>();
		System.out.println("My linkedlist:"+heros);
		heros.add("Yash");
		heros.add("Sudeep");
		heros.add("Tiger shrof");
		heros.add("Allu arjun");
		heros.add("Dharshan");
		heros.remove(2);
		System.out.println("My linkedlist after adding :"+heros);
		String temp=heros.get(0);
		System.out.println("My linkedlist after adding :"+temp);
		for (String h:heros) {
			System.out.println("My linkedlist after adding :"+heros);
		heros.add("ramcharan");
		System.out.println("My linkedlist after adding :"+heros);
		//((LinkedList<String>)heros).addFirst("Sam");
		((LinkedList<String>)heros).addLast("Sam");
		System.out.println("My linkedlist after adding :"+heros);
	}

}
}
