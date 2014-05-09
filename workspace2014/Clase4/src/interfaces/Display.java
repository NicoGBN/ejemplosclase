package interfaces;

public class Display extends Device{
	private String tactilTecnology;
	private String maxResolution;
	private String displaySize;
	public String getTactilTecnology() {
		return tactilTecnology;
	}
	public String getMaxResolution() {
		return maxResolution;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setTactilTecnology(String tactilTecnology) {
		this.tactilTecnology = tactilTecnology;
	}
	public void setMaxResolution(String maxResolution) {
		this.maxResolution = maxResolution;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	
	
}
