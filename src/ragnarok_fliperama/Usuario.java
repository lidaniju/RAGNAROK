package ragnarok_fliperama;

import java.util.Random;


public class Usuario {
	
	private int ID_usuario;
	private int saldo_fichas;
	private String nome_usuario;
	private String email_usuario;
	
	public Usuario() {
		this.ID_usuario = (new Random()).nextInt();
		this.saldo_fichas = 0;
	}

	public void Comprar_fichas(int quantidade) {
		this.saldo_fichas = this.saldo_fichas + quantidade;
	}
	
	public String Ver_saldo() {
		return "Saldo " + this.saldo_fichas;
	}
	
	public void Comprar_produto(Produto produto) {
		if (produto.getQntd_estoque() > 0) {
			produto.Reduzir_estoque();
			produto.Pedido();
		}else {
			
		}
	}

}
