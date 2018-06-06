package by.varvashevich.flowersi.entity;

public class Flower extends Goods {
	
	int stalkLenght;
	String color;
	
	public Flower () {
		
	}
	
	public Flower(String name, double price) {
		
		
	}

	public Flower(String name, double price, int stalkLenght, String color) {
		super(name, price);
		
		this.stalkLenght = stalkLenght;
		this.color = color;
	}

	

}
