package day15;
import java.util.*;


public class Vectordemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Vector<Integer>  v = new Vector<Integer>();
		v.add(2);
		v.add(22);
		v.add(3);
		v.add(45);
		v.add(33);
		v.add(200);
		v.add(222);
		v.add(9);
		v.add(1);
		v.add(8);
		v.add(0);
		
		v.remove(6);
		
		
		for(int i : v)
		{
			System.out.println("Ele: \t"+i);
		}
		
		System.out.println("Capacity : \t"+v.capacity());
		
		
		
		

	}

}
