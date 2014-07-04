package App.Forms;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import C.ValidadorCaixa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * Classe responsavel pelas registros as operação de abertura de caixa
 * @author Neimar
 */
public class Form_AbrirCaixa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSaldoInicial;
	private JButton btnExcluir;
	private JTextField txtDataCaixa = null;
	private JLabel lblData;
	private JTextField txtCodCaixa = null;
	private JLabel lblCod;
	private JButton btnLiberar;
	private JComboBox<String> txtResponsavel = null;
	private JLabel lblResponsavel;

	
	private void addSaldoInicial() {
		JLabel lblNewLabel = new JLabel("Saldo inicial:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(27, 174, 76, 26);
		contentPane.add(lblNewLabel);
		
		txtSaldoInicial = new JTextField();
		txtSaldoInicial.setForeground(Color.BLACK);
		txtSaldoInicial.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSaldoInicial.setBounds(122, 173, 261, 29);
		contentPane.add(txtSaldoInicial);
		txtSaldoInicial.setColumns(10);
	}
	
	
	private void addIdCaixa() {
		txtCodCaixa = new JTextField();
		txtCodCaixa.setForeground(Color.BLACK);
		txtCodCaixa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCodCaixa.setColumns(10);
		txtCodCaixa.setBounds(122, 46, 261, 29);
		contentPane.add(txtCodCaixa);
		
		lblCod = new JLabel("Id caixa:");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCod.setBounds(26, 47, 86, 26);
		contentPane.add(lblCod);	
	}
	
	
	private void addDataAbertura() {
		txtDataCaixa = new JTextField();
		txtDataCaixa.setForeground(Color.BLACK);
		txtDataCaixa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDataCaixa.setColumns(10);
		txtDataCaixa.setBounds(122, 107, 261, 29);
		contentPane.add(txtDataCaixa);
		
		lblData = new JLabel("Data abertura:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblData.setBounds(26, 108, 86, 26);
		contentPane.add(lblData);		
	}
	
	
	private void addResponsavel() {
		txtResponsavel = new JComboBox<String>();
		txtResponsavel.setBackground(Color.WHITE);
		txtResponsavel.setForeground(Color.BLACK);
		txtResponsavel.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Jose", "Carlos", "Pedro"}));
		txtResponsavel.setBounds(122, 240, 261, 29);
		contentPane.add(txtResponsavel);
		
		lblResponsavel = new JLabel("Responsável:");
		lblResponsavel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResponsavel.setBounds(27, 241, 86, 26);
		contentPane.add(lblResponsavel);
	}
	
	private void addBtnLiberarCaixa() {
		btnLiberar = new JButton("Liberar");
		btnLiberar.setForeground(new Color(34, 139, 34));
		btnLiberar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					
				ValidadorCaixa.validadata((String) txtDataCaixa.getText());
				ValidadorCaixa.validaSaldo(Integer.parseInt(txtSaldoInicial.getText()));
				ValidadorCaixa.validaFuncionario(((String) txtResponsavel.getSelectedItem ()).intern());
				
			}
		});
		btnLiberar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLiberar.setBounds(122, 303, 261, 37);
		contentPane.add(btnLiberar);		
	}
	
	
	private void addBtnExcluir() {
		btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(204, 0, 0));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Msgs.ObjetoNaoImplementado();	
			}
		});
		btnExcluir.setBounds(122, 370, 261, 37);
		contentPane.add(btnExcluir);
	}
	
	/**
	 * Definidor de layaut da tele
	 */
	private void defineLayaut() {		
		setBounds(200, 150, 499, 506);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	private Form_AbrirCaixa() {
		super("Abrir caixa");
		defineLayaut();
		addIdCaixa();
		addDataAbertura();
		addSaldoInicial();
		addResponsavel();
		addBtnExcluir();
		addBtnLiberarCaixa();		
	}
	
	
	/**
	 * Abre freme 
	 */
	public static void abreFreme() {
		Form_AbrirCaixa frame = new Form_AbrirCaixa();
		frame.setVisible(true);		
	}

}
