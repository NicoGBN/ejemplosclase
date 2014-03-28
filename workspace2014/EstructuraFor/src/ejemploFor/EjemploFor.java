package ejemploFor;

import java.io.IOException;

public class EjemploFor {

	public static void main(String[] args) throws IOException {
		int i=0;
		System.out.println("while");
		while (i<=5){
			System.out.println(i);
			i++;
		}

		System.out.println("do");
		do
		{
			
			System.out.println(i);
			i--;
		} while(i>=5);		
		for(int j=0;j<5;j++){
			
			System.out.println("J="+j);
			
		}

	}

}
