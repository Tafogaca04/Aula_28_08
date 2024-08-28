package Aula_28_08;

public class Gamer implements Computador{
	 @Override
	 public  void ligar() {
		 System.out.println("computador Gamer ligado");
	 }
	 @Override
	 public void desligar() {
		 System.out.println("computador Gamer desligado");
	 }
	 @Override
	 public void reniciar() {
		 System.out.println("computador Gamer reniciado");
	}
	 @Override
	 public void carregandoSistema() {
		 System.out.println("carregando o sistema");
	 }
	
	 }
	