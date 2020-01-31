
public class NonAlcoholic extends Drink {
	
	boolean soda;

	public NonAlcoholic(String name, boolean soda) {
		super();
		this.name = name;
		this.soda = soda;
		
	}
	
	@Override
	public String description() {
		
		String ukus = "Bljutav!!!";

		if (soda == true) {
			return "Pice je gazirano" + ", a ukus je uzasno " + ukus;
		}
		else if (soda == false) {
			return "Pice je negazirano" + ", a ukus je " + ukus;
		}
		
		else {
			return name + " usao u else";
	}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + soda;
	}
	
}
