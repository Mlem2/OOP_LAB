package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc [MAX_NUMBERS_ORDERED] ;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("hust.soict.dsai.aims.cart.Cart is full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println(disc.getTitle() + " has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("hust.soict.dsai.aims.cart.Cart is full");
            return;
        }

        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        System.out.println(dvd1.getTitle() + " has been added");

        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("hust.soict.dsai.aims.cart.Cart is full");
            return;
        }

        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println(dvd2.getTitle() + " has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdlist) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("hust.soict.dsai.aims.cart.Cart is full");
            return;
        }

        for (int i = 0; i < dvdlist.length; i++) {
            itemsOrdered[qtyOrdered] = dvdlist[i];
            qtyOrdered++;
            System.out.println(dvdlist[i].getTitle() + " has been added");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("hust.soict.dsai.aims.cart.Cart is full");
                return;
            }
        }
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
            System.out.println(disc.getTitle() + " not in hust.soict.dsai.aims.cart");
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

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i+1) + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
    }

    public void searchById(int id) {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        boolean dvdExists = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (i + 1 == id) {
                dvdExists = true;
                System.out.println((i+1) + itemsOrdered[i].toString());
            }
        }
        if (!dvdExists) {
            System.out.println("NO MATCH");
        }
    }

    public void searchByTitle(String title) {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        boolean dvdExists = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                dvdExists = true;
                System.out.println((i+1) + itemsOrdered[i].toString());
            }
        }
        if (!dvdExists) {
            System.out.println("NO MATCH");
        }
    }
}
