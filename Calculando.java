package Aula_28_08;

public class Calculando implements Calculo{
 double a,b;
 int c,d;
	 @Override
	 public  double somar(){
		return 20+10;
	 }
	 @Override
	 public double subtrair() {
		 return 20-10;

	 }
	 @Override
	 public double multiplicar() {
		 return 20*10; 
	}
	 @Override
	 public int dividir() {
		 return 20/10;
	 }
	 @Override
	 public int expoente() {
		 return 20^10;
	 }
	
	 }