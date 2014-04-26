package manejoDeErrores;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String rta = JOptionPane.showInputDialog(null,
				"Ingrese un número", "EjemploTryCatch", 
				JOptionPane.QUESTION_MESSAGE);
		
		try {
			int nro=Integer.parseInt(rta);
			String mensaje;
			if(nro<10){
				mensaje="Menor";
			}else if (nro>10){
				mensaje="Mayor";
			}else{
				mensaje="Igual";
			}
			//mensaje.charAt(40);
			
			JOptionPane.showMessageDialog(null, mensaje);
		}catch (StringIndexOutOfBoundsException e){
			e.printStackTrace();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					null, "No entendió que eran nros?",
					"ups...", JOptionPane.ERROR_MESSAGE);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			JOptionPane.showMessageDialog(null, "finally");
		}
		
	}

}
