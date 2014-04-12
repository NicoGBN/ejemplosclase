package herencia;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Padre");
		Padre p = new  Padre();
		System.out.println(p.MetodoPadreSinHerencia());
		System.out.println(p.MetodoConHerencia());
		System.out.println(p.EjecutaPadre());
		
		System.out.println();
		System.out.println("Hijo");
		Hijo h=new Hijo();
		System.out.println(h.MetodoPadreSinHerencia());
		System.out.println(h.MetodoConHerencia());
		System.out.println(h.EjecutaPadre());
		System.out.println(h.MetodoDelHijo());
		
		System.out.println();
		System.out.println("HijoDisfrazado");
		Padre q=new Hijo(); //boxing
		System.out.println(q.MetodoPadreSinHerencia());
		System.out.println(q.MetodoConHerencia());
		System.out.println(q.EjecutaPadre());
		Hijo h2 = (Hijo)q; //unboxing y "(Hijo)q" se llama cast o casting
		System.out.println(h2.MetodoDelHijo());
		System.out.println(((Hijo)q).MetodoDelHijo());
		//Hijo h3=(Hijo)p; //da error de casteo
	}

}
