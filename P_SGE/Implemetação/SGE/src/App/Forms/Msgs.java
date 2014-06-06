package App.Forms;
import javax.swing.*;

public class Msgs {
	
	public static void msg(Object desc){	
		//System.out.print(desc);
		JOptionPane.showMessageDialog(null,desc);
	}	
	
	public static void ObjetoNaoImplementado(){
		Msgs.msg("Não implementado!");
	}
}
