package ragnarok_fliperama;

public class Main {

	public static void main(String[] args) {
		
			var usuario =  new Usuario();
			
			usuario.Comprar_fichas(10);
			
			System.out.println(usuario.Ver_saldo());
	}

}
