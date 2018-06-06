package by.varvashevich.flowersi.entity;

public class NaturalFLWR extends Flower {
	
		
	public NaturalFLWR () {
		
	}
	
	public NaturalFLWR(String name, double price, 
			int stalkLenght, String color) {
		super(name, price, stalkLenght, color);
		
		
	}
	
	
	public void smell () {
		System.out.println("smell");
	}

	
	
	
NaturalFLWR vasilek = new NaturalFLWR();
	
	public NaturalFLWR getVasilek() {
		return vasilek;
	}
	
	public void setVasilek(NaturalFLWR vasilek) {
		this.vasilek = vasilek;
	}
	

	

}
