package M;

public class AbreCaixa {
	static int codCaixa;
	static String fucionario, dateAbertura;
	static int saldoInicial; 
	
	public static void setCodCaixa(int codCaixa) {
		AbreCaixa.codCaixa = codCaixa;
	}
	
	public static void setFucionario(String fucionario) {
		AbreCaixa.fucionario = fucionario;
	}
	
	public static void setDateAbertura(String dateAbertura) {
		AbreCaixa.dateAbertura = dateAbertura;
	}
	
	public static void setSaldoInicial(int saldoInicial) {
		AbreCaixa.saldoInicial = saldoInicial;
	}
	
	public static int getCodCaixa() {
		return codCaixa;
	}
	
	public static String getFucionario() {
		return fucionario;
	}
	
	public static String getDateAbertura() {
		return dateAbertura;
	}
	
	public static int getSaldoInicial() {
		return saldoInicial;
	}
}
