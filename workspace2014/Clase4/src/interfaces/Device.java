package interfaces;

public abstract class Device {
	private int id;
	private int serial;
	private String name;
	private String brand;
	private String model;
	public int getId() {
		return id;
	}
	public int getSerial() {
		return serial;
	}
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
