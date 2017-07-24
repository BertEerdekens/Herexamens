package pxl.hoofdstuk1.cleaningv2;

public class GardeningServiceImpl implements GardeningService{
	private GardeningTool tool;
	
	public void setGardeningTool(GardeningTool tool) {
		this.tool = tool;
	}
	
	public void garden() {
		System.out.println("Working in the garden");
		tool.doGardenJob();
	}
}
