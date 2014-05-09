package Fremes;
import javax.swing.*;

public class Form_Prints {
	
	public static void msg(Object desc){	
		//System.out.print(desc);
		JOptionPane.showMessageDialog(null,desc);
	}	
	
	public static void ObjetoNaoImplementado(){
		Form_Prints.msg("Não implementado!");
	}
}
