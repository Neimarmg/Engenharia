package C;

import App.Forms.Form_AbrirCaixa;
import App.Forms.Msgs;
import M.Usuarios;

/**
 * Classe responsavel pala auteticação de acessos
 * @author Neimar
 */
public class ValidadorUser {
	
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
			Msgs.msg("Senha inválida");			
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
			Msgs.msg("Senha ou cargo inválido");	
			break;
		}
	}
}


