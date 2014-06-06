package C;

import App.Forms.Msgs;
import M.AbreCaixa;

public class ValidadorCaixa {
	
	/**
	 * Informa campo embraco
	 * @param data
	 */
	public static void validadata(String data){
		if (data == null){
			Msgs.msg("Data de abertura inválida!");	
		}else{
			AbreCaixa.setDateAbertura(data);
			Msgs.msg("ok!");				
		}		
	}	
	
	
	/**
	 * Informa campo embraco
	 * @param nome
	 */
	public static void validaFuncionario(String nome){		
		if (AbreCaixa.getFucionario() == null){
			Msgs.msg("Responsavel inválido!");			
		}else{			
			AbreCaixa.setFucionario(nome);
		}			
	}
	
	
	/*
	 * Informa campo embraco
	 */
	public static void validaSaldo(int saldo){
		Msgs.msg(saldo);
		if (AbreCaixa.getSaldoInicial() == 0){
			Msgs.msg("Seu saldo e zero deseja seguir assim mesmo!");
			AbreCaixa.setSaldoInicial(saldo);
		}
	}
}
