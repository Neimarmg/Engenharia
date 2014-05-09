package controller;

import Fremes.Form_AbrirCaixa;
import Fremes.Form_Prints;
import model.AbreCaixa;
import model.Usuarios;

/**
 * Classe responsavel pala auteticação de acessos
 * @author Neimar
 */
public class Validador {
	
	public static boolean validaCargo(String cargo){
		if (cargo.equals(Usuarios.getCargo())){
			return true;		
		}else{
			return false;
		}
	}
	
	
	public static boolean validaSenha(String senha){
		if (senha.equals(Usuarios.getSenha())){
			return true;		
		}else{
			return false;			
		}
	}
	
	
	public static void autenticaUser(String cargo, String senha){
		if (validaCargo(cargo) == true && validaSenha(senha)== true){
			Form_AbrirCaixa.abreFreme();		
		}else{
			Form_Prints.msg("Senha inválida");			
		}
	}	
	
		
	public static void verificaAcesso(String cargo, String senha){
		
		switch (cargo) {
		
		case "Diretor":	
			autenticaUser(cargo, senha);	
			break;
			
		case "Auxiliar":
			Usuarios.setSenha("123");
			Usuarios.setCargo("Auxiliar");
			autenticaUser(cargo, senha);			
			break;		
				
		default:
			Form_Prints.msg("Senha ou cargo inválido");	
			break;
		}
	}
	
	
	public static void validadata(String data){
		if (AbreCaixa.getDateAbertura() == null){
			Form_Prints.msg("Data de abertura inválida!");			
		}else{
			AbreCaixa.setDateAbertura(data);
		}		
	}	
	
	
	public static void validaFuncionario(String nome){		
		if (AbreCaixa.getFucionario()== null){
			Form_Prints.msg("Responsavel inválido!");			
		}else{			
			AbreCaixa.setFucionario(nome);
		}			
	}
	
	
	public static void validaSaldo(int saldo){
		if (AbreCaixa.getSaldoInicial() == 0){
			Form_Prints.msg("Seu saldo e zero deseja seguir assim mesmo!");
			AbreCaixa.setSaldoInicial(saldo);
		}
	}
}


