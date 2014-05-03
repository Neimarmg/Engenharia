package Fremes;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CaixaDiario extends JFrame implements ActionListener {	

	private static final long serialVersionUID = 1L;	
	Container grid = getContentPane();
	JComboBox opcOperação;
	JTextField user;
	JTextField senha;
	JButton validar;
	JButton sair;
	
	public CaixaDiario() {
		super("Abertura de caixa diário");				
	
		opcOperação = new JComboBox();
		opcOperação.addActionListener(this);		
		
		user = new JTextField("Usuário: "); 
		user.addActionListener(this);		
		
		senha = new JTextField("Senha: "); 
		senha.addActionListener(this);		
		
		validar = new JButton("Validar"); 
		validar.addActionListener(this);

		sair = new JButton("Sair"); 
		sair.addActionListener(this);
		
		
		grid.setLayout(new GridLayout(5,5,2,2));
		grid.add(opcOperação);
		grid.add(user);
		grid.add(senha);
		grid.add(validar);
		grid.add(sair);
		
		LayoutFreme();
	}
	
	public void LayoutFreme() {		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,300);	
		setLocation(300, 200);
		setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== opcOperação ){
			
			
		}
		
	}
}

