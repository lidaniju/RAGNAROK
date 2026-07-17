package ragnarok_fliperama;

public class Produto {

	private String Nome_produto;
	private double Preco_produto;
	private int Qntd_estoque;
	
	public Produto(String Nome_produto, double Preco_produto) {
		
		this.Qntd_estoque = 0;
	}
	
	public void Reduzir_estoque() {
		if (this.Qntd_estoque > 0) {
            this.Qntd_estoque--;
		}else {
			System.out.println("Produto esgotado no estoque!");
		}
	}
	
	public void Pedido() {
		System.out.println("Pedido realizado para o produto: " + this.Nome_produto);
	}
	
	public String getNome_produto() { return Nome_produto; }
    public void setNome_produto(String nome_produto) { this.Nome_produto = nome_produto; }
	
    public int getQntd_estoque() { return Qntd_estoque; }
    public void setQntd_estoque(int Qntd_estoque) { this.Qntd_estoque = Qntd_estoque;}
    
    public double getPreco_produto() { return Preco_produto; }
    public void setPreco_produto(double Preco_produto) { this.Preco_produto = Preco_produto; }
}
