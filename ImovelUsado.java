package lista04;

public class ImovelUsado extends Imovel {
	public Float desconto;

	public Float getDesconto() {
		return desconto;
	}

	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}

	public ImovelUsado() {
		super();
	}

	public ImovelUsado(String endereco, Double preco) {
		super(endereco, preco);
		this.getDesconto();
	}

}
