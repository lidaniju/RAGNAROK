package ragnarok_fliperama;

public class Fliperama {

	private int ID_fliperama;
	private String Nome_jogo;
	private String Status_fliperama;
	private int Custo_fichas;
	private Ranking ranking;
	
	public Fliperama (int ID_fliperama, String Nome_jogo, String Status_fliperama, int Custo_fichas, Ranking ranking) {
		this.ID_fliperama = ID_fliperama;
		this.Nome_jogo = Nome_jogo;
		this.Status_fliperama = Status_fliperama;
		this.Custo_fichas = Custo_fichas;
		this.ranking = ranking;
	}
	
	public void Iniciar_partida() {
		if ("Disponivel".equalsIgnoreCase(this.Status_fliperama)) {
			System.out.println("Iniciando partida de " + this.Nome_jogo);
		}else {
			System.out.println("Este fliperama esta " + this.Status_fliperama);
		}
	}
		
}
