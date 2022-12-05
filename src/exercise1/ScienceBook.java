package exercise1;

public class ScienceBook extends Book {
	   private double price;
	   @Override
	   public void setPrice(double price) {
	       // apply discount
	       this.price=price-price*0.10;      
	   }
	   
	// Overriding Of the Abstract Methods
	   
	   @Override
	   public String getGenre() {
	       return "Science Book";
	   }
	   public double getPrice()
	   {
	       return this.price;
	   }
	}