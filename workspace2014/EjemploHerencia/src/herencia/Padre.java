package herencia;

public class Padre {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Padre(){
		this.setNombre("Padre");
	}
	
	public String MetodoPadreSinHerencia(){
		return "MetodoPadreSinHerencia:"+this.getNombre();
	}
	
	public String MetodoConHerencia(){
		return "MetodoConHerenciaPadre";
	}
	
	public String EjecutaPadre(){
		return "EjecutaPadre";
	}
}
