package ejemploClase2;

public class Persona {

	private int edad;
	private String nombre;
	private String email;
	
	public Persona() {}
	
	public Persona(String nombre, String email, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setEmail(email);	
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getPresentacion(){
		String s=this.getNombre()+" tiene el email "
				+this.getEmail();
		return s;
	}
	
}
