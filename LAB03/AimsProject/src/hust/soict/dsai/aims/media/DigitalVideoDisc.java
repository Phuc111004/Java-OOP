package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Media {
	private int length;
	private String director;
	private static int nbDigitalVideoDiscs = 0; 
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
       
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
	public DigitalVideoDisc(String title) {
        this.title = title;
        this.category = "";
        this.director = "";
        this.length = 0;
        this.cost = 0.0f;

        // Tăng số lượng DVD và gán một ID duy nhất
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
	
	
	public int getLength() {
		return length;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String directorSet) {
        this.director = directorSet;
    }

    public void setLength(int lengthSet) {
        this.length = lengthSet;
    }

    public void setid(int idSet) {
        this.id = idSet;
    }
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
	}
}