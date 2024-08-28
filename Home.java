package Aula_28_08;

public class Home implements Computador{
	 @Override
	 public  void ligar() {
		 System.out.println("computador  Home ligado");
	 }
	 @Override
	 public void desligar() {
		 System.out.println("computador Home desligado");
	 }
	 @Override
	 public void reniciar() {
		 System.out.println("computador Home reniciado");
	}
	 @Override
	 public void carregandoSistema() {
		 System.out.println("carregando o sistema");
	 }
	
	 }
	