package by.varvashevich.flowersi.entity;

public class Flower extends Goods {
	
	int stalkLenght;
	String color;
	
	public Flower(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Flower(String name, double price, int stalkLenght, String color) {
		super(name, price);
		
		this.stalkLenght = stalkLenght;
		this.color = color;
	}

	

}
