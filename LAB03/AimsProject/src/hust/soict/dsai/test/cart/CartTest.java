package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		 Cart cart = new Cart();
	        
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Adventure", "John Doe", 120, 15.99f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Animation", "Jane Smith", 90, 12.99f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alladin", "Action", "Joe Russo", 180, 19.99f);

	        // Add DVDs to the cart
	        cart.addDigitalVideoDisc(dvd1);
	        cart.addDigitalVideoDisc(dvd2);
	        cart.addDigitalVideoDisc(dvd3);
	        

	        // Print the cart
	        cart.print();

	        // Search by title
	        cart.searchByTitle("Solomon");
	        cart.searchByTitle("Frozen");

	        // Search by ID
	        cart.searchById(2);
	        cart.searchById(10);

	        // Remove a DVD
	        cart.removeDigitalVideoDisc(dvd2);
	        cart.print();
	    }
}

