
public class Destino {
	private String descricao;
	private double acao;
	public String getDescricao() {
		return descricao;
	}
	public double getAcao() {
		return acao;
	}
	
	protected Destino(String descricao, double acao) {
		this.descricao = descricao;
		this.acao = acao;
	}
}
