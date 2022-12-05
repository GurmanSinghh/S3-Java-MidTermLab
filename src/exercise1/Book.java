package exercise1;
	
	public abstract class Book {
		
		//Variable Declaration

	   private String title;
	   private String ISBN;
	   private String publisher;
	   private double price;
	   private int year;

	   //Constructor
	   
	   public Book()
	   {
	       this.title="";
	       this.ISBN="";
	       this.publisher="";
	       this.price=0;
	       this.year=0;
	   }
	   
	   //Getters And Setters
	   
	   public String getTitle()
	   {
	       return this.title;
	   }
	   public void setTitle(String title)
	   {
	       this.title=title;
	   }
	   public String getISBN()
	   {
	       return this.ISBN;
	   }
	   public void setISBN(String isbn)
	   {
	       this.ISBN=isbn;
	   }
	   public String getPublisher()
	   {
	       return this.publisher;
	   }
	   public void setPublisher(String pub)
	   {
	       this.publisher=pub;
	   }
	   public int getYear()
	   {
	       return this.year;
	   }
	   public void setYear(int year)
	   {
	       this.year=year;
	   }

	   // Abstract Method to determine the price of the book
	   
	   public abstract void setPrice(double price);

	   // Abstract Method to determine the Genre of the book
	   
	   public abstract String getGenre();
	  
	   // toString() Method that returns all the information stored
	   
	   public String toString()
	   {
	       return "Title : "+this.title+"\nISBN : "+this.ISBN+"\nPublisher : "+this.publisher+"\nYear : "+this.year;
	   }

	}


