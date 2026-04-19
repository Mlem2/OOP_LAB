package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private int numberOfDiscInStore = 0;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];

    public void addDvdToStore(DigitalVideoDisc disc) addr{
        if (numberOfDiscInStore == 100) {
            System.out.println("store.Store is full");
            return;
        }

        itemsInStore[numberOfDiscInStore] = disc;
        numberOfDiscInStore++;
        System.out.println(disc.getTitle() + " has been added");
    }

    public void removeDvdFromStore(DigitalVideoDisc disc) {
        int x = -1;
        for (int i = 0; i < numberOfDiscInStore; i++) {
            if (itemsInStore[i].getTitle().equals(disc.getTitle())) {
                itemsInStore[i] = null;
                x = i;
                break;
            }
        }

        if (x == -1) {
            System.out.println(disc.getTitle() + " not in store");
            return;
        } else {
            System.out.println(disc.getTitle() + " has been removed");
        }

        for (int i = x; i < numberOfDiscInStore; i++) {
            if (i == 100 - 1) {
                itemsInStore[i] = null;
            }
            itemsInStore[i] = itemsInStore[i + 1];
        }

        numberOfDiscInStore--;
    }
}
