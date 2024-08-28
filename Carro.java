package Aula_28_08;

public class Carro extends Abstrato_veiculo {
 @Override
 public  void acelerar() {
	 System.out.println("Acelerando");
 }
 @Override
 public void frear() {
	 System.out.println("freando");
 }
 @Override
 public void virar() {
	 System.out.println("virando");
 }
 @Override
 public void ligar() {
	 System.out.println("ligando");
 }
}
