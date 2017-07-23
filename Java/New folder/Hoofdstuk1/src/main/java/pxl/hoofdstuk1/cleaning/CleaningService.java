package pxl.hoofdstuk1.cleaning;

public class CleaningService {
	private Broom broom = new Broom();
	
	public void clean() {
		System.out.println("cleaning the house");
		broom.doCleanJob();
	}

}
