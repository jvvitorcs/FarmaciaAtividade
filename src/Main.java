import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		RepositorioProdutos repositorioProdutos = new RepositorioProdutos();
		RepositorioClientes repositorioClientes = new RepositorioClientes();

		Produto p1 = new Produto(1, "Gadernal", "Remedio de doido", "Medicamento", 0, 3, 0.1f, 130.00f, "ACME", 0);
		Produto p2 = new Produto(2, "Resfenol", "Remedio para gripe", "Medicamento", 0, 3, 0.1f, 15.00f, "ACME", 0);
		Cliente c1 = new Cliente("Fabio", 1);

		repositorioProdutos.inserir(p1);
		repositorioProdutos.inserir(p2);
		repositorioClientes.inserir(c1);

		Produto pProcurado = repositorioProdutos.procurarProduto(1);
		Cliente cProcurado = repositorioClientes.procurarCliente("Fabio");

		if (pProcurado.getNome().equals("Gadernal")) {
			System.out.println("Armazenou corretamente");

		}

		System.out.println("------------------------------------------");

		System.out.println("Chegaram mercadorias hoje? S/N");

		String mercadoria = entrada.next();

		while (mercadoria.equals("S")) {
			System.out.println("Qual ID do produto que chegou?");
			int novoProduto = entrada.nextInt();
			System.out.println("Qual a quantidade?");
			int qtdProduto = entrada.nextInt();
			pProcurado = repositorioProdutos.procurarProduto(novoProduto);
			pProcurado.EstoqueFornecido(qtdProduto);
			System.out.println("Foi fornecido " + qtdProduto + " pacotes de " + pProcurado.getNome());
			System.out.println("Mais algum produto chegou? S/N");
			mercadoria = entrada.next();
		}

		if (mercadoria.equals("N")) {
			System.out.println("Uma pena, vamos aguardar algum cliente.");
		} else {
			System.out.println("Opção inválida, digite novamente.");
		}

		System.out.println("------------------------------------------");

		System.out.println("Chegou algum cliente? S/N");

		String cliente = entrada.next();
		if (cliente.equals("S")) {
			System.out.println("Quem está fazendo a compra?");

			String NomeComprador = entrada.next(); 
			cProcurado = repositorioClientes.procurarCliente(NomeComprador);
			while (cliente.equals("S")) {
				System.out.println("Qual produto ele deseja comprar?");
				System.out.println("1. Gadernal" + "\r\n" + "2. Resfenol");
				int novoProduto = entrada.nextInt();
				pProcurado = repositorioProdutos.procurarProduto(novoProduto);

				System.out.println("Quantos " + pProcurado.getNome() + " ele deseja levar?");
				int qtdProduto = entrada.nextInt();
				pProcurado.DiminuirEstoque(qtdProduto);
				
				System.out.println("Ainda temos: ");
				ArrayList<Produto> todosOsProdutos = repositorioProdutos.getAll();
				for (int i = 0; i < todosOsProdutos.size(); i++) {
					Produto p = todosOsProdutos.get(i);					
					System.out.println(p.getEstoque() + " " + p.getNome());
					
				}

				System.out.println("Deseja comprar mais alguma coisa?");
				cliente = entrada.next();
				if (cliente.equals("N")) {
					System.out.println("O cliente " + cProcurado.getCPF() + " comprou " + "um tanto de tal e tal");
					break;
				}
				
			}
			
		} else if (cliente.equals("N")) {
			System.out.println("Se continuarmos assim, a farmácia vai falir.");
			
		} else {
			System.out.println("Opção inválida, digite novamente.");
		}
	}

}
