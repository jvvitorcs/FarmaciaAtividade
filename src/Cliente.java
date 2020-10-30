
public class Cliente {
	
	private String _nome;
	private int _CPF;
	
	public Cliente(String nome, int numero) {
		this._nome = nome;
		this._CPF = numero;
	}
	
	public String getNome() {
		return this._nome;
	}
	
	public int getCPF() {
		return this._CPF;		
	}
}
