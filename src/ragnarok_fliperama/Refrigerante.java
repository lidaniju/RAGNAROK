package ragnarok_fliperama;

public class Refrigerante extends Produto {

	private String Marca_refri;
	private int TamanhoML_refri;
	
	public Refrigerante (String Nome_produto, double Preco_produto, int Qntd_estoque, String Marca_refri, int TamanhoML_refri) {
		super(Nome_produto, Preco_produto);
		super.setQntd_estoque(Qntd_estoque);
		this.Marca_refri = Marca_refri;
        this.TamanhoML_refri = TamanhoML_refri;
	}
	
}
