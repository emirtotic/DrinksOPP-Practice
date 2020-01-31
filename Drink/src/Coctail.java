
public class Coctail extends Alcoholic {
	
	String base;
	
	double sastojak1;
	double sastojak2;
	double sastojak3;
	
	public Coctail(String name, double sastojak1, double sastojak2, double sastojak3) {
		super();
		this.name = name;
		this.base = "Alcoholic";
		this.sastojak1 = sastojak1;
		this.sastojak2 = sastojak2;
		this.sastojak3 = sastojak3;
		this.type = AlcoholType.Cocktail;
		this.vol = vol;
		
	}

	@Override
	public String description() {
		
		vol = 100 / (sastojak1 + sastojak2 + sastojak3);
		
		
		return name + ". Alcohol Vol. " + vol; 
	}
	
	public String convenience() {
		
		return "U pitanju je koktel!";
		
	}
	
	@Override
	public String toString() {
		return name + " Alcohol Vol. " + vol;
	}
	
}
