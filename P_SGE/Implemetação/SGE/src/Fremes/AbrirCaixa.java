package Fremes;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class AbrirCaixa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSaldoInicial;
	private JButton btnExcluir;
	private JTextField txtDataCaixa;
	private JLabel lblData;
	private JTextField txtCodCaixa;
	private JLabel lblCod;
	private JButton btnCancelar;
	private JComboBox<String> txtResponsavel;
	private JLabel lblResponsavel;

	
	private void addSaldoInicial() {
		JLabel lblNewLabel = new JLabel("Saldo inicial:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(9, 178, 75, 26);
		contentPane.add(lblNewLabel);
		
		txtSaldoInicial = new JTextField();
		txtSaldoInicial.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSaldoInicial.setBounds(92, 177, 171, 29);
		contentPane.add(txtSaldoInicial);
		txtSaldoInicial.setColumns(10);
	}
	
	
	private void addIdCaixa() {
		txtCodCaixa = new JTextField();
		txtCodCaixa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCodCaixa.setColumns(10);
		txtCodCaixa.setBounds(92, 46, 171, 29);
		contentPane.add(txtCodCaixa);
		
		lblCod = new JLabel("cod:");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCod.setBounds(7, 47, 75, 26);
		contentPane.add(lblCod);	
	}
	
	
	private void addDataAbertura() {
		txtDataCaixa = new JTextField();
		txtDataCaixa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDataCaixa.setColumns(10);
		txtDataCaixa.setBounds(92, 114, 171, 29);
		contentPane.add(txtDataCaixa);
		
		lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblData.setBounds(9, 115, 75, 26);
		contentPane.add(lblData);		
	}
	
	
	private void addResponsavel() {
		txtResponsavel = new JComboBox<String>();
		txtResponsavel.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Jose", "Carlos"}));
		txtResponsavel.setBounds(92, 243, 171, 29);
		contentPane.add(txtResponsavel);
		
		lblResponsavel = new JLabel("Responsável:");
		lblResponsavel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResponsavel.setBounds(10, 244, 86, 26);
		contentPane.add(lblResponsavel);
	}
	
	private void addBtnCancelar() {
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prints.ObjetoNaoImplementado();	;
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(92, 378, 171, 37);
		contentPane.add(btnCancelar);		
	}
	
	
	private void addBtnExcluir() {
		btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(204, 0, 0));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prints.ObjetoNaoImplementado();	
			}
		});
		btnExcluir.setBounds(92, 306, 171, 37);
		contentPane.add(btnExcluir);
	}
	
	
	private void defineLayaut() {		
		setBounds(100, 100, 352, 507);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	private AbrirCaixa() {
		super("Abrir caixa");
		defineLayaut();
		addIdCaixa();
		addDataAbertura();
		addSaldoInicial();
		addResponsavel();
		addBtnExcluir();
		addBtnCancelar();		
	}
	
	
	/**
	 * Abre freme 
	 */
	public static void abreFreme() {
		AbrirCaixa frame = new AbrirCaixa();
		frame.setVisible(true);		
	}

}
