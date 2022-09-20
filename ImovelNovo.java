package lista04;

public class ImovelNovo extends Imovel {
	public Float adicional;

	public Float getAdicional() {
		return adicional;
	}

	public void setAdicional(Float adicional) {
		this.adicional = adicional;
	}

	public void imprimeAdicional() {
		System.out.println("O valor adicional é de " + adicional);
	}

	public ImovelNovo(String endereco, Double preco, Float adicional) {
		super(endereco, preco);
		this.adicional = adicional;
	}



}
