
public class Cake {

	private int bites = 10;
	
	public Cake() {
		//FIXME
	}
	
	public void takeABite() {
		--bites;
		System.out.println("Hmm.. yummy");
	}
	
	public boolean isEmpty() {
		return bites == 0;
	}
}
