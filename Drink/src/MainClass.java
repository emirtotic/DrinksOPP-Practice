
public class MainClass {

	public static void main(String[] args) {
		
		Coctail c1 = new Coctail("Pina Collada", 4, 3.2, 0.5);
		
		System.out.println(c1.description());
		System.out.println(c1.convenience());
		System.out.println(c1);
		
		Alcoholic a1 = new Alcoholic("Amstel", 4.1);
		
		System.out.println(a1);
		System.out.println(a1.description());
		System.out.println(a1.convenience());
		
		Alcoholic a2 = new Alcoholic("Vranac", 12);
		
		System.out.println(a2.description());
		System.out.println(a2.convenience());
		
		NonAlcoholic n1 = new NonAlcoholic("Breskva", false);
		System.out.println(n1.description());
		
		Alcoholic a3 = new Alcoholic("Whiskey", 21);
		System.out.println(a3.description());
		System.out.println(a3.convenience());
		
		
		

	}

}
