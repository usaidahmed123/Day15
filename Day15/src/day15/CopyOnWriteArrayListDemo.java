package day15;
import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lis = new CopyOnWriteArrayList<String>();
		lis.add("1one");
		lis.add("2two");
		lis.add("3three");
		lis.add("four4");
		lis.add("five5");
		
		Iterator<String> u = lis.iterator();
		while(u.hasNext()) {
			String s = u.next();
			System.out.println(s);
			if(s.equals("1one")) {
				lis.remove("2two");
			}
			
			if(s.equals("3three")) {
				lis.add("7seven");
			}
			System.out.println(lis);
		}

	}

}
