package interfaces;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Device> dispositivos=new ArrayList<Device>();
		Device disp=new Display();
		//Display.setAlgo(AlgunValor)=Valor;
		dispositivos.add(disp);
		Device disp2=new Tablet();
		dispositivos.add(disp2);
		Device disp3=new TabletLiviana();
		dispositivos.add(disp3);
		
		for (Device d : dispositivos) {
			if(d instanceof IConPeso){
				System.out.println(((IConPeso)d).getWeight());
			}
		}
		
		
		
		System.out.println(disp2.getClass());
		System.out.println(disp2.getClass().getInterfaces()[0]);
		System.out.println(IConPeso.class.isAssignableFrom(disp2.getClass()));
		System.out.println(disp2 instanceof IConPeso);

		System.out.println("TabletLiviana");
		
		System.out.println(disp3.getClass());
		System.out.println(disp3.getClass().getInterfaces()[0]);
		System.out.println(IConPeso.class.isAssignableFrom(disp3.getClass()));
		System.out.println(disp3 instanceof IConPeso);
		
		System.out.println(Device.class.isAssignableFrom(disp3.getClass()));
		System.out.println(disp3 instanceof Device);
		

		
		
	}

}
