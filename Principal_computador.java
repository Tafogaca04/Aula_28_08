package Aula_28_08;

public class Principal_computador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computador computador1 = new Home();
		Computador computador2 = new Gamer();
		
	System.out.println("___________________________________________________________");
		computador1.ligar();
		computador1.desligar();
		computador1.reniciar();
		computador1.carregandoSistema();
	System.out.println("___________________________________________________________");
		
		computador2.ligar();
		computador2.desligar();
		computador2.reniciar();
		computador2.carregandoSistema();
	}

}
