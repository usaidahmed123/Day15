package day15;
import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> y = new Vector<>();
		y.add("a");
		y.add("b");
		y.add("c");
		y.add("d");
		y.add("e");
		
		Enumeration<String>  ele = y.elements();
		while(ele.hasMoreElements()) {
			String i = ele.nextElement();
			System.out.println(i);
			y.add("abc");
		}
		System.out.println("?????????????????????");
		System.out.println(y);
	}

}
