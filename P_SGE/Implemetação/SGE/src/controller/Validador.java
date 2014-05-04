package controller;

import Fremes.AbrirCaixa;
import Fremes.Prints;
import model.Usuarios;

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
	
	
	public static void validaAcesso(String cargo, String senha){
		if (validaCargo(cargo)== true && validaSenha(senha)== true  ){
			AbrirCaixa.abreFreme();		
		}else{
			Prints.msg("Senha ou cargo inválido");
		}
	}
}