package tst;

public class BinomioEntidadeFake {
	private static final Exception IllegalAccessException = null;
	int k,n, coefiente;

	
	public int getK() {
		return k;
	}

	
	public BinomioEntidadeFake(int k, int n, int coefiente) {
		super();
		this.k = k;
		this.n = n;
		this.coefiente = coefiente;
	}


	public void setK(int k) throws Exception {
		if (this.n != getK()){
			throw IllegalAccessException;
		}		
	}

	
	public int getN() {
		return n;
	}
	
	
	public void setN(int n) {
		this.n = n;
	}


	public int getCoefiente() {
		return coefiente;
	}


	public void setCoefiente(int coefiente) {
		this.coefiente = coefiente;
	}	
}
