package day15;

enum Mobile {
	
	SAMSUNG, GTC, XIAOMI, BLACKBERRY;
	int price;
	Mobile() {
		price = 80;
		System.out.println("Constructor");
	}
	public int getprice() {
		return price;
	}
}

public class enumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = Mobile.XIAOMI;
		switch(m)
		{
		case GTC:
			System.out.println("Some local company");
			break;
		case XIAOMI:
			System.out.println("Best company from my point of view");
			break;
		case SAMSUNG:
			System.out.println("baddest experience company from my pov");
			break;
		case BLACKBERRY:
			System.out.println("baddest experience company from my pov");
			break;
		}
		
		
		
		
		System.out.println(Mobile.BLACKBERRY.getprice());
	}

}
