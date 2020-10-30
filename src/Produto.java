public class Produto {

	private int _ID;
	private String _Nome;
	private String _Descricao;	
	private String _Tipo;
	private int _Estoque;
	private int _Validade;
	private float _Desconto;
	private float _Preco;
	private String _Fornecedor;
	private int _Comprador;
	
	public Produto(int id, String nome, String descricao, String tipo, int quantidade, int validade, float desconto, float preco, String fornecedor, int comprador) {
		
		this._ID = id;
		this._Nome = nome;
		this._Descricao = descricao;
		this._Tipo = tipo;
		this._Estoque = quantidade;
		this._Validade = validade;			
		this._Desconto = desconto;
		this._Preco = preco;
		this._Fornecedor = fornecedor;
		this._Comprador = comprador;
		
	}
	public int getID() {
		return this._ID;		
	}
	
	public int setID(int inputId) {
		return this._ID = inputId;
	}
	
	public String getNome() {
		return this._Nome;		
	}
	
	public String setNome(String inputNome) {
		return this._Nome = inputNome;		
	}
	
	public String getDescricao() {
		return this._Descricao;		
	}
	
	public String getTipo() {
		return this._Tipo;		
	}
	
	public int getEstoque() {
		return this._Estoque;
	}
	
	public void DiminuirEstoque(int QtdVendido) {
		this._Estoque -= QtdVendido;
	}
	
	public void EstoqueFornecido(int QtdEstocado) {
		this._Estoque += QtdEstocado;
	}
	
	public int getValidade() {
		return this._Validade;
	}
	
	public float getDesconto() {
		return this._Desconto;
	}
	
	public float getPreco() {
		return this._Preco = this._Preco - this._Preco * this._Desconto;
	}
	public String getFornecedor() {
		return this._Fornecedor;
	}
	
	public String setFornecedor(String inputFornecedor) {
		return this._Fornecedor = inputFornecedor;
	}
	
	public int getComprador(){
		return this._Comprador;
	}
	
	public int setComprador(int num) {
		return this._Comprador = num;
	}
}
