package domasno2;

public class Glavna {
	public static void main(String[] args) {
		Student marko = new Student();
		marko.setId(1);
		marko.setIme("Marko");
		marko.setGodini(18);
		
		System.out.println("Reden broj " + marko.getId() + " e studentot " + marko.getIme() + " star " + marko.getGodini() + " godini "); 
		

	}
}
