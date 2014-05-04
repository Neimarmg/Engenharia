package Fremes;
import javax.swing.*;

public class Prints {
	
	public static void msg(Object desc){	
		//System.out.print(desc);
		JOptionPane.showMessageDialog(null,desc);
	}	
	
	public static void ObjetoNaoImplementado(){
		Prints.msg("Não implementado!");
	}
}
