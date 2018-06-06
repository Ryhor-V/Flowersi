package by.varvashevich.flowersi.entity;

public class PartofBuoq extends Goods {

	String name;
	double price;

	Goods leafOfTree[] = new Goods[10];

	Goods goods[] = new Goods[10];

	public PartofBuoq() {

	}

	public PartofBuoq(String name, double price) {
		super(name, price);

	}

	public String getname() {
		return this.name;
	}

	public double getprice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	NaturalFLWR chamomile = new NaturalFLWR();

	
	
	

	public NaturalFLWR getChamomile() {
		return chamomile;
	}
	public void setChamomile(NaturalFLWR chamomile) {
		this.chamomile = chamomile;
	}
	
	

	NaturalFLWR heather = new NaturalFLWR();
	public NaturalFLWR getHeather() {
		return heather;
	}
	
	public void setHeather(NaturalFLWR heather) {
		this.heather = heather;
	}
	
	

	
	
	
}
	

