public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Câu lệnh trong class Cart
		        // Tạo giỏ hàng mới
		        Cart anOrder = new Cart();

		        // Tạo các đối tượng DVD mới và thêm chúng vào giỏ hàng
		        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f,5);
		        anOrder.addDigitalVideoDisc(dvd1);

		        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f,4);
		        anOrder.addDigitalVideoDisc(dvd2);

		        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","", 0, 18.99f,3);
		        anOrder.addDigitalVideoDisc(dvd3);
		          
		        anOrder.removeDigitalVideoDisc(dvd3);
		        
		        anOrder.searchByTitle("The Lion King");
		        anOrder.searchByID(2);

		        anOrder.print();
		        
		        // In tổng chi phí của các mục trong giỏ hàng
		        System.out.println("Total Cost is: ");
		        System.out.println(anOrder.totalCost());
		        
		    }

	}
