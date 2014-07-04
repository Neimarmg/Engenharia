package PCBin;

public class CalucularBinomioControle {
	private BinomioEntidade e;
	
	
	public CalucularBinomioControle(BinomioEntidade e) {
		super();
		this.e = e;
	}


	public int calcula(int n, int k){
		e.setN(n);
		e.setK(k);
		return e.getCoefiente();		
	}
}
