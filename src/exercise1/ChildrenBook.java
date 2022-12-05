package exercise1;

public class ChildrenBook extends Book {
	   private double price;

	   //Overriding of the abstract methods
	   
	   @Override
	   public void setPrice(double price) {
	       this.price=price;
	      
	   }

	   @Override
	   public String getGenre() {
	       return "Children Book";
	   }
	   public double getPrice()
	   {
	       return this.price;
	   }

	}
