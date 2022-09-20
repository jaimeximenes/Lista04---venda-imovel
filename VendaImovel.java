package lista04;

public class VendaImovel {
	public void mostrarDesconto(ImovelUsado obj) {
		obj.getDesconto();

	}

	public void mostrarAdicional(ImovelNovo obj) {
		obj.getAdicional();
	}

	public static void main(String[] args) {

		Imovel i = new Imovel();
		i.getPreco(150000.00);
		i.getEndereco("Rua fulano de tal");
		

		int opcao = 1;
		switch (opcao) {
		case 1:
			
			mostrarAdicional();
		case 2:
			
			mostrarDesconto();
		}
	}

}
