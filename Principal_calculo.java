package Aula_28_08;

import java.util.Scanner;

public class Principal_calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner ler = new Scanner (System.in);
		Calculando resultado1 = new Calculando();
	

		
		
		
	System.out.println("___________________________________________________________");
	
	resultado1.somar();
	 System.out.println(resultado1.somar());
	 System.out.println(resultado1.subtrair());
	 System.out.println(resultado1.multiplicar());
	 System.out.println(resultado1.dividir());
	 System.out.println(resultado1.expoente());
	System.out.println("___________________________________________________________");
	
		
	}

}
