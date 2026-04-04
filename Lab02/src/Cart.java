import java.awt.*;

public class Cart {
    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc [MAX_NUMBERS_ORDERED] ;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Cart is full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println(disc.getTitle() + " has been added");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int x = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                itemsOrdered[i] = null;
                x = i;
                break;
            }
        }

        if (x == -1) {
            System.out.println(disc.getTitle() + " not in cart");
            return;
        } else {
            System.out.println(disc.getTitle() + " has been removed");
        }

        for (int i = x; i < qtyOrdered; i++) {
            if (i == MAX_NUMBERS_ORDERED - 1) {
                itemsOrdered[i] = null;
            }
            itemsOrdered[i] = itemsOrdered[i + 1];
        }

        qtyOrdered--;
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }
}
