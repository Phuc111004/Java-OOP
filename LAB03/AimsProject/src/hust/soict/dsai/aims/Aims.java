package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Câu lệnh trong class Cart
		Cart anOrder = new Cart();
        DigitalVideoDisc[] dvd = new DigitalVideoDisc[3];

        dvd[0] = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        dvd[1] = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        dvd[2] = new DigitalVideoDisc("Aladdin", "Animation",null, 0, 18.99f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 2", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars the next day", "Science Fiction", "George Lucas", 87, 24.95f);
        

       
        anOrder.addDigitalVideoDisc(dvd3,dvd4);
        anOrder.print();
		    }
}
