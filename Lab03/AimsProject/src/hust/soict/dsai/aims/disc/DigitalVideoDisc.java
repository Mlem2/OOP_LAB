package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.length = length;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);
    }

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return (".DVD - " + title + " - " + category
                + " - " + director + " - " + length + ": "
                + cost + "$");
    }
}
