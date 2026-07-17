package ragnarok_fliperama;

public class Pizza extends Produto {

	private String Sabor_pizza;
	private char Tamanho_pizza;
	
	public Pizza(String Nome_produto, double Preco_produto, int Qntd_estoque, String Sabor_pizza, char Tamanho_pizza) {
		super(Nome_produto, Preco_produto);
		super.setQntd_estoque(Qntd_estoque);
		this.Sabor_pizza = Sabor_pizza;
        this.Tamanho_pizza = Tamanho_pizza;
	}
	
}
