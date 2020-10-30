import java.util.ArrayList;

public class RepositorioClientes {		
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	/**
	 * Metodo de Inserir Conta
	 */
	public void inserir(Cliente c) {
		this.clientes.add(c);
		System.out.println("Cliente Inserido !!!");
	}
	
	/**
	 * Metodo que retorna a Quantidade de Contas Armazendas no momento em que este método é executado.
	 */
	public int qtdDeClientesArmazenadasNoBancodeDados() {
		return this.clientes.size();
	}
	
	/**
	 * Retorna todas as contas (na prática retorna o array com as contas)
	 */
	public ArrayList<Cliente> getAll() {
		return this.clientes;
	}
	
	
	/**
	 * Procurar uma conta no array, e a retorna assim que encontrá-la
	 */
	public Cliente procurarCliente(String nome) {
		Cliente clienteProcurado = null;
		
		for (int i = 0; i < this.clientes.size(); i++) {
			Cliente c = this.clientes.get(i);
			
			if(c.getNome() == nome) {
				clienteProcurado = c;
				break;

			}
		}
		
		return clienteProcurado;
	}
}
