import java.util.ArrayList;

public class Jogador {
	private String cor;
	private double dinheiro;
	private ArrayList<Carta> aquisicoes;
	
	public Jogador(String cor, double dinheiro) {
		super();
		this.cor = cor;
		this.dinheiro = dinheiro;
	}
	
	public boolean addCarta(Carta carta) {
			aquisicoes.add(carta);
		return true;
	}
	
	public String getCor() {
		return cor;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public ArrayList<Carta> getAquisicoes() {
		return aquisicoes;
	}
	
}
