package pxl.hoofdstuk1.cleaningv2;

public class CleaningServiceImpl implements CleaningService{
	private CleaningTool tool;
	
	public void setCleaningTool(CleaningTool tool) {
		this.tool = tool;
	}
	
	public void clean() {
		System.out.println("cleaning the house");
		tool.doCleanJob();
	}

}
