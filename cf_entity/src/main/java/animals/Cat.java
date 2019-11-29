package animals;

public class Cat {


	private String name;
	private int weight;
	private int strenght;
	private int expierence;
	
	public Cat(String name, int weight, int strenght, int expierence) {
		super();
		this.name = name;
		this.weight = weight;
		this.strenght = strenght;
		this.expierence = expierence;
	}
	public Cat(String name, int weight, int strenght) {
		super();
		this.name = name;
		this.weight = weight;
		this.strenght = strenght;
		this.expierence = 0;
	}
	public Cat() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	public int getExpierence() {
		return expierence;
	}
	public void setExpierence(int expierence) {
		this.expierence = expierence;
	}
}
