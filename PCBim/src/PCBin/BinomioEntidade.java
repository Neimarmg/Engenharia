package PCBin;

public class BinomioEntidade implements IBinomioEntidade {
	int k,n;

	
	public void setK(int k) {
		this.k = k;
	}

	
	public void setN(int n) {
		this.n = n;
	}	
	
	
	public int getCoefiente(){
		int r, p1 = 0, p2 = 0, p3 = 0;
		p1 = Fatorial.calcular(n);
		p1 = Fatorial.calcular(k);
		p1 = Fatorial.calcular(n - k);
		r = (p1/(p2 - p3));
		return r;
	}
}
