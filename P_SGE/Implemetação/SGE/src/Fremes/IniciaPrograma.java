package Fremes;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IniciaPrograma extends JFrame implements ActionListener {	

	private static final long serialVersionUID = 1L;
	
	Container grid = getContentPane();
	JButton abreCaixa;
	JButton fechaCaixa;
	JButton confere;
	JButton operacinal;
	JButton sair;
	
	public IniciaPrograma() {
		super("SGE - Sistema de gestão para escritórios");				
	
		abreCaixa = new JButton("Abre caixa");
		abreCaixa.addActionListener(this);		
		
		fechaCaixa = new JButton("Fechar caixa"); 
		fechaCaixa.addActionListener(this);		
		
		confere = new JButton("Confere caixa"); 
		confere.addActionListener(this);		
		
		operacinal = new JButton("Abrir caixa em modo operacional"); 
		operacinal.addActionListener(this);

		sair = new JButton("Sair"); 
		sair.addActionListener(this);
		
		
		grid.setLayout(new GridLayout(5,5,2,2));
		grid.add(abreCaixa);
		grid.add(operacinal);
		grid.add(fechaCaixa);
		grid.add(confere);
		grid.add(sair);
		
		LayoutFreme();
	}
	
	public void LayoutFreme() {		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,600);	
		setLocation(200, 100);
		setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== abreCaixa ){
			logCaixa logCaixa = new logCaixa();
			Frame.getFrames();
			
		}
		
	}
}

