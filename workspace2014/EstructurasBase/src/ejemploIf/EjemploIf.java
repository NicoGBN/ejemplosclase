package ejemploIf;

public class EjemploIf {
	
	public static void main(String[] args) {
		int miVariable=0;	
		if (miVariable==1){
			System.out.println("1");
		} else if (miVariable==0) {
			System.out.println("0");
		} else {
			System.out.println("no se");
		}
		switch (miVariable) {
		case 0:
			System.out.println("Switch: dio 0");
			break;
		case 1:
			System.out.println("Switch: dio 1");
			break;
		default:
			System.out.println("Nada");
			break;
		}
	}

}
