package Aula_28_08;

public class Principal_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Gato gato = new Gato();
		   Cachorro cao = new Cachorro();
		   Leao leao = new Leao();
		   Lobos lobo = new Lobos ();
		   Tigre tigre  = new Tigre();
		   
		   gato.setRaca("gato holandes");
		   gato.setNome("garfield");
		   gato.setSexo("macho");
		   
		   cao.setRaca("shih tzu");
		   cao.setNome("Babi");
		   cao.setSexo("fêmea");
		   
		   leao.setRaca("Leão da África");
		   leao.setNome("Alex");
		   leao.setSexo("macho");
		   
		   tigre.setRaca("tigre asiático");
		   tigre.setNome("Esmeralda");
		   tigre.setSexo("fêmea");
		   
		   lobo.setRaca("lobo Oriental");
		   lobo.setNome("Alfa");
		   lobo.setSexo("fêmea");
		   
		   System.out.println("----------GATO-----------");
		   System.out.println(gato.getRaca());
		   System.out.println(gato.getNome());
		   System.out.println(gato.getSexo());
		   gato.caminhar();
		   gato.correr();
		   gato.dormir();
		   gato.emitirSom();
		   System.out.println("_____________________________________________");
		   
		   System.out.println("----------CACHORRO-----------");
		   System.out.println(cao.getRaca());
		   System.out.println(cao.getNome());
		   System.out.println(cao.getSexo());
		   cao.caminhar();
		   cao.correr();
		   cao.dormir();
		   cao.emitirSom();
		   System.out.println("_____________________________________________");
		  
		   System.out.println("----------LEÃO-----------");
		   System.out.println(leao.getRaca());
		   System.out.println(leao.getNome());
		   System.out.println(leao.getSexo());
		   leao.caminhar();
		   leao.correr();
		   leao.dormir();
		   leao.emitirSom();
		   System.out.println("_____________________________________________");
		   
		   System.out.println("----------TIGRE-----------");
		   System.out.println(tigre.getRaca());
		   System.out.println(tigre.getNome());
		   System.out.println(tigre.getSexo());
		   tigre.caminhar();
		   tigre.correr();
		   tigre.dormir();
		   tigre.emitirSom();
		   System.out.println("_____________________________________________");
		  
		   System.out.println("----------LOBO-----------");
		   lobo.caminhar();
		   lobo.correr();
		   lobo.dormir();
		   lobo.emitirSom();
		   System.out.println("_____________________________________________");
		  
		  
	}

}
