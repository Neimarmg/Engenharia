package Fremes;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import controller.Validador;

public class logCaixa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField textSenha;
	private JLabel lblSenha;
	private JButton btnEntra;
	private static JComboBox<String> cargo;
	private JLabel lblCargo;

	
	
	public static void setCargo(JComboBox<String> cargo) {
		logCaixa.cargo = cargo;
	}
	
	public static JComboBox<String> getCargo() {
		return cargo;
	}
	
	public static void setTextSenha(JTextField textSenha) {
		logCaixa.textSenha = textSenha;
	}
	
	public static JTextField getTextSenha() {
		return textSenha;
	}
	
	private void addUsuario() {
		cargo = new JComboBox<String>();
		cargo.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Diretor", "Auxiliar"}));
		cargo.setBounds(83, 48, 127, 29);
		contentPane.add(cargo);
		
		lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCargo.setBounds(27, 49, 52, 26);
		contentPane.add(lblCargo);
	}
	
	
	private void addSenha() {
		lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(27, 102, 52, 26);
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		textSenha.setColumns(10);
		textSenha.setBounds(83, 101, 127, 29);
		contentPane.add(textSenha);
	}
	
	
	private void addBtnEntra() {
		btnEntra = new JButton("Entrar");
		btnEntra.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				setCargo(cargo);
				setTextSenha(textSenha);
				Validador.validaAcesso(getCargo(),getTextSenha());
			}
		});
		btnEntra.setBounds(83, 155, 127, 37);
		contentPane.add(btnEntra);
		
	}
	
	
	private void defineLayaut() {		
		setBounds(100, 100, 291, 273);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	private logCaixa() {
		super("Abilitação da atividade");
		defineLayaut();
		addUsuario();
		addSenha();
		addBtnEntra();
	}
	
	
	/**
	 * Abre freme 
	 */
	public static void abreFreme() {
		logCaixa frame = new logCaixa();
		frame.setVisible(true);		
	}


	
	
	
	
}
