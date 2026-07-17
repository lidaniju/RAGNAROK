package ragnarok_fliperama;

public class Ranking {

	private int Pontuacao;
	private String Nome_recordista;
	
	public Ranking(int pontuacao, String nome_recordista) {
        this.Pontuacao = pontuacao;
        this.Nome_recordista = nome_recordista;
    }
	
	public void Atualizar(String Nome, int Pontos) {
		if (Pontos > this.Pontuacao) {
            this.Pontuacao = Pontos;
            this.Nome_recordista = Nome;
            System.out.println("Novo recorde estabelecido por " + Nome + " com " + Pontos + " pontos!");
        } else {
            System.out.println("Pontuação não superou o recorde atual.");
        }
	}
	
}
