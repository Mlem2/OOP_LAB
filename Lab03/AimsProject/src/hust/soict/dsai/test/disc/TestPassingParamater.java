package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParamater {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        objectWrapper obj1 = new objectWrapper(jungleDVD);
        objectWrapper obj2 = new objectWrapper(cinderellaDVD);

        swap(obj1, obj2);
        System.out.println("jungle dvd title: " + obj1.innerObject.getTitle());
        System.out.println("cinderella dvd title: " + obj2.innerObject.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System. out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(objectWrapper o1, objectWrapper o2) {
        DigitalVideoDisc tmp = o1.innerObject;
        o1.innerObject = o2.innerObject;
        o2.innerObject = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    static class objectWrapper {
        DigitalVideoDisc innerObject;
        public objectWrapper(DigitalVideoDisc objInnner) {
            this.innerObject = objInnner;
        }
    }
}
