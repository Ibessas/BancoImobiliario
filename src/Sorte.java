
public class Sorte extends Destino{
	private String descricao;
	private double acao;
	
	public Sorte(String descricao, double acao) {
		super(descricao,acao);
		this.descricao = descricao;
		this.acao = acao;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getAcao() {
		return acao;
	}
}
