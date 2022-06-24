
public class Sales {
	private String name;
	private int quantity;
	private float cost;
	
	void setSales(String name, int quantity, float cost) {
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	
	void printBasketDetails() {
		System.out.println("You ordered "+name+" and total quantity ordered is "+quantity);
	}
	
	float calculateAmount() {
		float totalAmount=quantity*cost;
		return totalAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales salesObj= new Sales();
		salesObj.setSales("Lays", 25, 10.5f);
		salesObj.printBasketDetails();
		System.out.print("Total billing amount is:RS "+salesObj.calculateAmount());
	}

}
