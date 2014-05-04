package controller;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Fremes.AbrirCaixa;
import Fremes.Prints;
import model.Usuarios;

public class Validador {

	
		
	
	private static boolean validaCargo(JComboBox<String> jComboBox){
		if (jComboBox.equals(Usuarios.getCargo())){
			return true;		
		}else{
			return false;
		}
	}
	
	
	private static boolean validaSenha(JTextField jTextField){
		if (jTextField.equals(Usuarios.getSenha())){
			return true;		
		}else{
			return false;
		}
	}
	
	
	public static void validaAcesso(JComboBox<String> jComboBox, JTextField jTextField ){
		if (validaCargo(jComboBox)== true && validaSenha(jTextField)== true  ){
			AbrirCaixa.abreFreme();		
		}else{
			Prints.msg("Senha ou cargo inválido");
		}
	}
}