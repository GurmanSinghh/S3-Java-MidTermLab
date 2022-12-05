package exercise1;

import javax.swing.*;



public class BookDriver {
   public static void main(String[] args) {

       // Create Science Book Project for displaying Science Book Details
	   
       ScienceBook sb = new ScienceBook();
      System.out.println("Enter Details for the Science Book: ");

 
       sb.setTitle(JOptionPane.showInputDialog(null, "Enter Science Book title : "));

    
       sb.setISBN(JOptionPane.showInputDialog(null, "Enter Science Book ISBN : "));

     
       sb.setPublisher(JOptionPane.showInputDialog(null, "Enter Science Book publisher : "));

       
       sb.setYear(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Science Book year : ")));

      
       sb.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Science Book Price : ")));

      
       JOptionPane.showMessageDialog(null, sb.toString() + "\nType : " + sb.getGenre() + "\n Price : " + sb.getPrice(),
               "Science Book Details", JOptionPane.INFORMATION_MESSAGE);

       //Create Children Book object for displaying the children books
       
       ChildrenBook cb = new ChildrenBook();
      System.out.println("Enter Details for the Children Book: ");

      
       cb.setTitle(JOptionPane.showInputDialog(null, "Enter Children Book title : "));

    
       cb.setISBN(JOptionPane.showInputDialog(null, "Enter Children Book ISBN : "));

       
       cb.setPublisher(JOptionPane.showInputDialog(null, "Enter Children Book publisher : "));

       
       cb.setYear(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Children Book year : ")));

      
       cb.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Children Book Price : ")));

       
       JOptionPane.showMessageDialog(null, cb.toString() + "\nType : " + cb.getGenre() + "\n Price : " + cb.getPrice(), "Children Book Details", JOptionPane.INFORMATION_MESSAGE);
   }

}
