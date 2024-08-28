package Aula_28_08;

public class Ferrari implements Veículo{
	 @Override
	 public  void ligar() {
		 System.out.println("carro ligado");
	 }
	 @Override
	 public void desligar() {
		 System.out.println("carro desligado");
	 }
	 @Override
	 public void engatar() {
		 System.out.println("engatando");
	}
	 @Override
	 public void manobrar() {
		 System.out.println("manobrando");
	 }
	 @Override
	 public void acelerar() {
		 System.out.println("acelerando");
	 }
	 @Override
	 public void frear() {
		 System.out.println("freando");
	 }
	}