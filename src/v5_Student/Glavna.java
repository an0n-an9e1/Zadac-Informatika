package v5_Student;

public class Glavna {
	public static void main(String[] args) {
		Student marko = new Student();
		marko.setId(1574);
		marko.setIme("Marko Dimitrovski");
		marko.setGodini(-1);
		
		System.out.println("Reden broj " + marko.getId() + " e studentot " + marko.getIme() +  " koj sto e " + marko.getGodini() + " godini.");
	}
}
