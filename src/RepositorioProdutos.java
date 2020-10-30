import java.util.ArrayList;

public class RepositorioProdutos {	
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void inserir(Produto p) {
		if(p.getTipo().equals("Medicamento") && p.getDesconto() <= 0.1f || p.getTipo().equals("Cosmetico") && p.getDesconto() <= 0.2f) { // Tem como pegar a referencia da classe e não criar um if? 
		this.produtos.add(p);		
		System.out.println("Produto Inserido !!!");
		}
	}
	
	
	public int qtdDeClientesArmazenadasNoBancodeDados() {
		return this.produtos.size();
	}
	
	
	public ArrayList<Produto> getAll() {
		return this.produtos;
	}	
	
	
	public Produto procurarProduto(int num) {
		Produto produtoProcurado = null;
		
		for (int i = 0; i < this.produtos.size(); i++) {
			Produto p = this.produtos.get(i);
			
			if(p.getID() == num) {
				produtoProcurado = p;
				break;

			}
		}
		
		return produtoProcurado;
	}
}
