package Aula_28_08;

public class Principal_transporte {

	public static void main(String[] args) {
		
   Onibus busao = new Onibus();
   Carro fusca = new Carro();
   System.out.println("-----------------------------------------");
   System.out.println("Busão");
   busao.acelerar();
   busao.frear();
   busao.ligar();
   busao.virar();
   System.out.println("_____________________________________________");
   System.out.println("fusca");
   System.out.println("-----------------------------------------");
   fusca.acelerar();
   fusca.frear();
   fusca.ligar();
   fusca.virar();
   System.out.print("___________________________________________________");



	}

}
