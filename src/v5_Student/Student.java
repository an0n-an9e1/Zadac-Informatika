package v5_Student;

public class Student {
	int id;
	String ime;
	int godini;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public int getGodini() {
		return godini;
	}
	public void setGodini(int godini) {
		if (godini >= 0 && godini <= 100) {
			this.godini = godini;
		} else {
			System.out.println("Godinite se vnesoa gresno!");
		}
	}
}
