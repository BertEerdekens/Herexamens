package pxl.hoofdstuk1.cleaningv2;

public class HouseApp {

	public static void main(String[] args) {
		CleaningTool broom = new Broom();
		CleaningTool vacuum = new VacuumCleaner();
		
		CleaningServiceImpl jill = new CleaningServiceImpl();
		jill.setCleaningTool(broom);
		
		CleaningServiceImpl jane = new CleaningServiceImpl();
		jane.setCleaningTool(vacuum);
		
		jill.clean();
		jane.clean();
	}
}
