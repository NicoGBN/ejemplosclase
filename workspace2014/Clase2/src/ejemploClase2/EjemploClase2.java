package ejemploClase2;

public class EjemploClase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona p = new Persona();
		p.setNombre("Juan Perez");
		p.setEdad(100);
		p.setEmail("jp@gmail.com");
		
		System.out.println(p.getPresentacion());
		
		Persona q =new Persona("John Doe",
				"jd@gmail.com", 99);
		
		System.out.println(q.getPresentacion());
	}		
}
