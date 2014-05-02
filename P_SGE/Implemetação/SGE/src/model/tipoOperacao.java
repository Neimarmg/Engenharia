package model;

public class tipoOperacao {
	static int codOperacao;
	static String nomeOperacao;
	
	public static void setCodOperacao(int codOperacao) {
		tipoOperacao.codOperacao = codOperacao;
	}
	
	public static void setNomeOperacao(String nomeOperacao) {
		tipoOperacao.nomeOperacao = nomeOperacao;
	}
	
	public static int getCodOperacao() {
		return codOperacao;
	}
	
	public static String getNomeOperacao() {
		return nomeOperacao;
	}
}
