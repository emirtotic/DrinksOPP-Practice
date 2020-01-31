
public class Alcoholic extends Drink {

	double vol;
	AlcoholType type;
	
	public Alcoholic() {
		super();
		this.vol = vol;
		this.type = type;
	}
	
	public Alcoholic(String name, double vol) {
		super();
		this.name = name;
		this.vol = vol;
		this.type = type;
	}
	
	@Override
	public String description() {
		
		return "Drink: " + this.name + " " + convenience() + ". Alcohol Vol. " + vol + "%"; 
	}
	
	public String convenience() {
		if (vol <= 10) {
			return "Tip: " + AlcoholType.Beer;
		}
		else if (vol > 10 && vol <= 20) {
			return "Tip " + AlcoholType.Vine;
		}
		else if (vol > 20) {
			return "Tip: " + AlcoholType.StrongDrink;
		}
		else {
			return "Pice je bezalkoholno";
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + vol + "%";
	}
	
}
