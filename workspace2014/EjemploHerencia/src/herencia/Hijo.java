package herencia;

public class Hijo extends Padre {

	///este está modificado 
	public Hijo(){
		this.setNombre("Hijo");
	}
	
	public String MetodoConHerencia(){
		return "MetodoConHerenciaHijo";
	}
	
	public String EjecutaPadre(){
		return super.EjecutaPadre()+"ModificaHijo";
	}
	
	public String MetodoDelHijo(){
		return "MetodoDelHijo";
	}
}
