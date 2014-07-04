package App.Forms;

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
import C.ValidadorUser;
import javax.swing.UIManager;


/**
 * Classe log destinada a todas a operaçãoes de caixa
 * @author Neimar
 */
public class Form_LogCaixa extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txtSenha;
	private JLabel lblSenha;
	private JButton btnEntra;
	private static JComboBox<?> txtCargo;
	private JLabel lblCargo;
	private String cargo,senha;
	
		
	public void setCago(String cargo) {
		this.cargo = (String) cargo.toString() ;
	}
	
	public void setSenha(String senha) {
		this.senha = (String) senha;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	public String getSenha() {
		return senha;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void addUsuario() {
		txtCargo = new JComboBox();
		txtCargo.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtCargo.setModel(new DefaultComboBoxModel(new String[] {"", "Diretor", "Auxiliar"}));
		txtCargo.setBounds(83, 48, 224, 29);
		contentPane.add(txtCargo);
		
		lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCargo.setBounds(27, 49, 52, 26);
		contentPane.add(lblCargo);
	}
	
	
	private void addSenha() {
		lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(27, 128, 52, 26);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSenha.setColumns(10);
		txtSenha.setBounds(83, 127, 224, 29);
		contentPane.add(txtSenha);
	}
	
	
	private void addBtnEntra() {
		btnEntra = new JButton("Entrar");
		btnEntra.setBackground(UIManager.getColor("Button.highlight"));
		btnEntra.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				setCago((( String ) txtCargo.getSelectedItem ()).intern());
				setSenha(( String ) txtSenha.getText());
				ValidadorUser.verificaAcesso(getCargo(),getSenha());
			}
		});
		btnEntra.setBounds(83, 200, 224, 37);
		contentPane.add(btnEntra);
		
	}
	
	
	private void defineLayaut() {		
		setBounds(300, 300, 392, 339);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	private Form_LogCaixa() {
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
		Form_LogCaixa frame = new Form_LogCaixa();
		frame.setVisible(true);		
	}
}
