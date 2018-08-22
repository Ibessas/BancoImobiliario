
public class CartaCasa extends Carta{
	private String cor;
	private double valor;
	private double[] melhoras;
	private double hipoteca;
	
	public CartaCasa(String nome,String cor, double valor, double[] melhoras, double hipoteca) {
		super(nome);
		this.cor = cor;
		this.valor = valor;
		this.melhoras = melhoras;
		this.hipoteca = hipoteca;
	}

	public String getCor() {
		return cor;
	}

	public double getValor() {
		return valor;
	}

	public double[] getMelhoras() {
		return melhoras;
	}

	public double getHipoteca() {
		return hipoteca;
	}
	
	
}
