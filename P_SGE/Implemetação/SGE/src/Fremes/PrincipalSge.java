package Fremes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

/**
 * Classe freme principal de execução do programa SGE
 * @author Neimar
 *
 */
public class PrincipalSge extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	JPanel OpracoesCaixa = new JPanel();
	JButton btnAIniciarCaixa = new JButton("Iniciar caixa");
	private final JButton btnFecharCaixa = new JButton("Fechar caixa");
	private final JButton btnConferirCaixa = new JButton("Conferir caixa");
	private final JPanel panel_1 = new JPanel();

	
	public void fechaCaixa(){
		btnFecharCaixa.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		btnFecharCaixa.setForeground(SystemColor.activeCaption);
		
		btnFecharCaixa.setBounds(110, 149, 293, 60);
		panel_1.add(btnFecharCaixa);
		btnFecharCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Prints.ObjetoNaoImplementado();				
			}
		});
		btnFecharCaixa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnFecharCaixa.setBackground(new Color(102, 205, 170));
		
	}
	
	public void confereCaixa(){
		btnConferirCaixa.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		btnConferirCaixa.setForeground(SystemColor.activeCaption);
		btnConferirCaixa.setBounds(110, 51, 293, 60);
		panel_1.add(btnConferirCaixa);
		btnConferirCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prints.ObjetoNaoImplementado();		
			
			}			
		});
		btnConferirCaixa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnConferirCaixa.setBackground(new Color(102, 205, 170));
		
	}
	
	
	public void agrupaOperacoesFechamento(){	
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(
			new EtchedBorder(EtchedBorder.LOWERED, null, null), 
			"Opera\u00E7\u00F5es de fechamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 70, 213)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(55, 320, 518, 246);
		contentPane.add(panel_1);
		
		confereCaixa();
		fechaCaixa();		
	}
	

	public void abreCaixa(){
		btnAIniciarCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logCaixa.abreFreme();			
			}
		});
		btnAIniciarCaixa.setForeground(SystemColor.activeCaption);
		btnAIniciarCaixa.setBounds(107, 50, 296, 60);
		OpracoesCaixa.add(btnAIniciarCaixa);
		btnAIniciarCaixa.setBackground(new Color(102, 205, 170));
		btnAIniciarCaixa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
	}
	
	
	public void abreModoOperacional(){				
		JButton btnAbrirModoOperacional = new JButton("Modo operacional");
		btnAbrirModoOperacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prints.ObjetoNaoImplementado();	
			}
		});
		btnAbrirModoOperacional.setForeground(Color.YELLOW);
		btnAbrirModoOperacional.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAbrirModoOperacional.setBackground(new Color(102, 205, 170));
		btnAbrirModoOperacional.setBounds(107, 150, 296, 60);
		OpracoesCaixa.add(btnAbrirModoOperacional);

	}
	
	
	public void agrupaOperaçõesCaixa(){		
		OpracoesCaixa.setBackground(SystemColor.window);
		OpracoesCaixa.setBorder(
			new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), 
					"Opera\u00E7\u00F5es de abertura", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 70, 213)));
		OpracoesCaixa.setBounds(55, 55, 518, 246);
		contentPane.add(OpracoesCaixa);
		OpracoesCaixa.setLayout(null);
		
		abreCaixa();
		abreModoOperacional();
	}
	
	
	/**
	 * Define layaut do freme
	 */
	public void defineLayaut(){
		setBackground(new Color(204, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 80, 633, 649);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	
	/**
	 * Cria freme principal do sistema.
	 */	
	public PrincipalSge() {
		super("SGE - Sistema de gestão de escritórios");
		defineLayaut();
		agrupaOperaçõesCaixa();
		agrupaOperacoesFechamento();
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalSge frame = new PrincipalSge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
