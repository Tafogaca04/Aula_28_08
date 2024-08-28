package Aula_28_08;

public  abstract class Animal_28 {
	String nome;
	String sexo;
	String raca;

	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirSom();

	public String getRaca(){
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo(){
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
		public void setNome(String nome) {
			this.nome = nome;
		}
			public String getNome(){
				return nome;
	}
}

