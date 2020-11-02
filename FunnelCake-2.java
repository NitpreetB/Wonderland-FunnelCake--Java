public class FunnelCake {

	private String size; 
	private int eat; 
	private double price; 
	private int toppings; 
	private static int count=0;
	
//constructor 

	public FunnelCake (String sz, int et, double pr, int top)
	{
		this.size=sz;
		this.eat=et;
		this.price=pr;
		this.toppings =top;
		count = count +1;
	}
	
	FunnelCake ()
	{
		size= "Small";
		eat= 1;
		price=  6.50;
		toppings=2;
		count = count +1;
	}
	
	// getters 
	public static int getCount()
	{
		return count;
	}
	public String getSize()
	{
		return size; 
	}
	
	public int getEat()
	{
		return eat;
	}
	
	public double getPrice()
	{
		return price; 
	}
	
	public int getToppings()
	{
		return toppings; 
	}
	
	//setters 
	public void setSize (String sz)
	{
		size = sz; 
	}
	
	public void setEat (int et)
	{
		eat = et; 
	}
	
	public void setPrice (double pr)
	{
		price = pr; 
	}

	
	//method for adding toppings 
	
	public int addToppings(int num)
	{
		toppings = toppings + num;
		return toppings;
	}
	
	//method for discount price 
	public double discountPrice (int num1)
	{
		double discount; 
		discount = price *(num1)* 0.1;
		price = price - discount;
		return price;
	}
}

