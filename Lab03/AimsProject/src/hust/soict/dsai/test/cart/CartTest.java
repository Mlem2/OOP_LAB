package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        //Create a new hust.soict.dsai.aims.cart
        Cart cart = new Cart();
        //Create new dvd objects and add them to the hust.soict.dsai.aims.cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation"
                , "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        //Test the print method hust.soict.dsai.aims.cart.print();
        cart.print();
        //To-do: Test the search methods here;
        cart.searchById(3);
        cart.searchByTitle("Aladin");
    }
}
