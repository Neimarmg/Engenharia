package controller;

import Fremes.AbrirCaixa;
import Fremes.Prints;
import model.Usuarios;

/**
 * Classe responsavel pala auteticação de acessos
 * @author Neimar
 */
public class Validador {
	
	private static boolean validaCargo(String cargo){
		if (cargo.equals(Usuarios.getCargo())){
			return true;		
		}else{
			return false;
		}
	}
	
	
	private static boolean validaSenha(String senha){
		if (senha.equals(Usuarios.getSenha())){
			return true;		
		}else{
			return false;
		}
	}
	
	
	private static void autenticaUser(String cargo, String senha){
		if (validaCargo(cargo) == true && validaSenha(senha)== true){
			AbrirCaixa.abreFreme();		
		}else{
			Prints.msg("Senha inválida");			
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
			Prints.msg("Senha ou cargo inválido");	
			break;
		}			
	}
}


