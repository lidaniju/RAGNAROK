package ragnarok_fliperama;

public class Produto {

	private String Nome_produto;
	private double Preco_produto;
	private int Qntd_estoque;
	
	public Produto() {
		this.Qntd_estoque = 0;
	}
	
	public void Reduzir_estoque() {
		if (this.Qntd_estoque > 0) {
            this.Qntd_estoque--;
		}
	}
	
	public void Pedido() {
		
	}
	
}
