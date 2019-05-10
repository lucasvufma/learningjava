package produtopackage;

public class Produto {
	private String Nome;
	private String Categoria;
	private double Preço;
	private boolean Usado;
	
	public Produto(String Nome,String Categoria,double Preço, boolean Usado) {
		this.Nome=Nome;
		this.Categoria=Categoria;
		this.Preço=Preço;
		this.Usado=Usado;
	}
	public String toString() {
		return this.Nome;
	}

	public Produto() {
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public double getPreço() {
		return Preço;
	}

	public void setPreço(double preço) {
		Preço = preço;
	}

	public boolean isUsado() {
		return Usado;
	}

	public void setUsado(boolean usado) {
		Usado = usado;
	}
	
	
	

}
