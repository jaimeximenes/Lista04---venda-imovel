package lista04;

public class Imovel {
	private String endereco;
	private Double preco;

	public Double getPreco() {
		return preco;
	}

	public void setPreco(double d) {
		this.preco = d;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Imovel () {
		
	}
	public Imovel(String endereco, Double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}


}
