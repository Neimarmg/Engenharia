package Aplicacao;

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

import Aplicacao.Forms.Form_LogCaixa;
import Aplicacao.Forms.Form_Prints;


/**
 * Classe freme principal de execução do programa SGE
 * @author Neimar
 *
 */
public class Appsge extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JPanel OpracoesCaixa = new JPanel();
	JButton btnAIniciarCaixa = new JButton("Iniciar caixa");
	private final JButton btnFecharCaixa = new JButton("Fechar caixa");
	private final JButton btnConferirCaixa = new JButton("Conferir caixa");
	private final JPanel painelApp = new JPanel();

	
	public void fechaCaixa(){
		btnFecharCaixa.setForeground(SystemColor.window);		
		btnFecharCaixa.setBounds(110, 149, 293, 60);
		painelApp.add(btnFecharCaixa);		
		btnFecharCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Form_Prints.ObjetoNaoImplementado();				
			}
		});
		btnFecharCaixa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnFecharCaixa.setBackground(new Color(102, 205, 170));
		
	}
	
	public void confereCaixa(){
		btnConferirCaixa.setForeground(SystemColor.WHITE);
		btnConferirCaixa.setBounds(110, 51, 293, 60);
		painelApp.add(btnConferirCaixa);
		btnConferirCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Prints.ObjetoNaoImplementado();		
			
			}			
		});
		btnConferirCaixa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnConferirCaixa.setBackground(new Color(102, 205, 170));
		
	}
	
	
	public void agrupaOperacoesFechamento(){	
		painelApp.setLayout(null);
		painelApp.setBorder(new TitledBorder(
			new EtchedBorder(EtchedBorder.LOWERED, null, null), 
			"Opera\u00E7\u00F5es de fechamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 70, 213)));
		painelApp.setBackground(Color.WHITE);
		painelApp.setBounds(55, 320, 518, 246);
		contentPane.add(painelApp);
		
		confereCaixa();
		fechaCaixa();		
	}
	

	public void abreCaixa(){
		btnAIniciarCaixa.setForeground(SystemColor.BLUE);
		btnAIniciarCaixa.setBounds(107, 50, 296, 60);
		btnAIniciarCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_LogCaixa.abreFreme();			
			}
		});
		OpracoesCaixa.add(btnAIniciarCaixa);
		btnAIniciarCaixa.setBackground(new Color(102, 205, 170));
		btnAIniciarCaixa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
	}
	
	
	public void abreModoOperacional(){				
		JButton btnAbrirModoOperacional = new JButton("Modo operacional");
		btnAbrirModoOperacional.setForeground(Color.YELLOW);
		btnAbrirModoOperacional.setFont(new Font("Comic Sans MS", Font.BOLD, 15));		
		btnAbrirModoOperacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Prints.ObjetoNaoImplementado();	
			}
		});

		btnAbrirModoOperacional.setBackground(new Color(102, 205, 170));
		btnAbrirModoOperacional.setBounds(107, 150, 296, 60);
		OpracoesCaixa.add(btnAbrirModoOperacional);

	}
	
	
	/**
	 * Subdivisão d
	 */
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
	public Appsge() {
		super("SGE - Sistema de gestão de escritórios");
		defineLayaut();
		agrupaOperaçõesCaixa();
		agrupaOperacoesFechamento();
	}
	
	
	/**
	 * Inicia programa SGE.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appsge frame = new Appsge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
