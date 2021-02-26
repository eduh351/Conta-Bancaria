import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Conta {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtAgencia;
	private JTextField txtNumero;
	private JTextField txtDep;
	private JTextField txtSaq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta window = new Conta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 472, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(66, 8, 358, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Agencia");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		txtAgencia = new JTextField();
		txtAgencia.setBounds(66, 39, 86, 20);
		frame.getContentPane().add(txtAgencia);
		txtAgencia.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Conta");
		lblNewLabel_2.setBounds(190, 45, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		txtNumero = new JTextField();
		txtNumero.setBounds(246, 42, 86, 20);
		frame.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);

		JPanel panelDep = new JPanel();
		panelDep.setBounds(129, 87, 295, 62);
		frame.getContentPane().add(panelDep);
		panelDep.setLayout(null);

		ClassesConta conta = new ClassesConta();

		JButton btnDep = new JButton("Deposito");
		btnDep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelDep.setVisible(true);
			}
		});
		btnDep.setBounds(10, 87, 89, 23);
		frame.getContentPane().add(btnDep);

		JLabel lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setBounds(10, 11, 46, 14);
		panelDep.add(lblNewLabel_3);

		txtDep = new JTextField();
		txtDep.setBounds(66, 8, 86, 20);
		panelDep.add(txtDep);
		txtDep.setColumns(10);

		JButton btnFim = new JButton("Fim");
		btnFim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dep = Integer.parseInt(txtDep.getText());
				conta.depositar(dep);

			}
		});
		btnFim.setBounds(196, 7, 89, 23);
		panelDep.add(btnFim);

		JPanel panelSaq = new JPanel();
		panelSaq.setBounds(129, 167, 295, 62);
		frame.getContentPane().add(panelSaq);
		panelSaq.setLayout(null);

		JButton btnSaq = new JButton("Saque");
		btnSaq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelSaq.setVisible(true);

			}
		});
		btnSaq.setBounds(10, 167, 89, 23);
		frame.getContentPane().add(btnSaq);

		JLabel lblNewLabel_4 = new JLabel("Valor");
		lblNewLabel_4.setBounds(10, 11, 46, 14);
		panelSaq.add(lblNewLabel_4);

		txtSaq = new JTextField();
		txtSaq.setBounds(66, 8, 86, 20);
		panelSaq.add(txtSaq);
		txtSaq.setColumns(10);

		JButton btnFimS = new JButton("Fim");
		btnFimS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int saq = Integer.parseInt(txtSaq.getText());
				conta.sacar(saq);
			}
		});
		btnFimS.setBounds(196, 7, 89, 23);
		panelSaq.add(btnFimS);

		JPanel panelSal = new JPanel();
		panelSal.setBounds(129, 248, 295, 116);
		frame.getContentPane().add(panelSal);
		panelSal.setLayout(null);

		JLabel lblSal = new JLabel("<vazio>");
		lblSal.setBounds(66, 86, 82, 14);
		panelSal.add(lblSal);

		JLabel lblNome = new JLabel("");
		lblNome.setBounds(66, 11, 219, 14);
		panelSal.add(lblNome);

		JLabel lblAgencia = new JLabel("");
		lblAgencia.setBounds(66, 36, 219, 14);
		panelSal.add(lblAgencia);

		JLabel lblConta = new JLabel("");
		lblConta.setBounds(66, 61, 219, 14);
		panelSal.add(lblConta);

		JButton btnSal = new JButton("Saldo");
		btnSal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double saldo = conta.lerSaldo();
				lblSal.setText(String.format("%.2f", saldo));

				String nome = txtNome.getText();
				lblNome.setText(nome);

				int agc = Integer.parseInt(txtAgencia.getText());
				lblAgencia.setText(Integer.toString(agc));

				int conta = Integer.parseInt(txtNumero.getText());
				lblConta.setText(Integer.toString(conta));

				panelSal.setVisible(true);

			}
		});
		btnSal.setBounds(10, 248, 89, 23);
		frame.getContentPane().add(btnSal);

		JLabel lblNewLabel_5 = new JLabel("Saldo");
		lblNewLabel_5.setBounds(10, 86, 46, 14);
		panelSal.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(10, 11, 46, 14);
		panelSal.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Agencia");
		lblNewLabel_7.setBounds(10, 36, 46, 14);
		panelSal.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Conta");
		lblNewLabel_8.setBounds(10, 61, 46, 14);
		panelSal.add(lblNewLabel_8);

		panelDep.setVisible(false);

		panelSaq.setVisible(false);

		panelSal.setVisible(false);
	}
}
