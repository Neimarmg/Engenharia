package model;

import javax.xml.crypto.Data;

public class AbreCaixa {
	static int codCaixa, codFucionario;
	static Data dateAbertura;
	static double saldoInicial; 
	
	public static void setCodCaixa(int codCaixa) {
		AbreCaixa.codCaixa = codCaixa;
	}
	public static void setCodFucionario(int codFucionario) {
		AbreCaixa.codFucionario = codFucionario;
	}
	
	public static void setDateAbertura(Data dateAbertura) {
		AbreCaixa.dateAbertura = dateAbertura;
	}
	
	public static void setSaldoInicial(double saldoInicial) {
		AbreCaixa.saldoInicial = saldoInicial;
	}
	
	public static int getCodCaixa() {
		return codCaixa;
	}
	
	public static int getCodFucionario() {
		return codFucionario;
	}
	public static Data getDateAbertura() {
		return dateAbertura;
	}
	
	public static double getSaldoInicial() {
		return saldoInicial;
	}
}
