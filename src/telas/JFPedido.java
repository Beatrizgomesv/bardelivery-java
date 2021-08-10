package telas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entidades.Cliente;
import entidades.Pedido;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFPedido extends JFrame {
	private JTextField txtAdegaJava;
	private JTextField txtDigiteOSeu;
	private JTextField txtDigiteSeuEndereo;
	private JTextField lblValorTotal;
	private JTextArea txtValorTotal;
	private Pedido pedido;
	/**
	 * Create the panel.
	 */
	public JFPedido() {
		getContentPane().setBackground(Color.BLACK);
		setBackground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
		
		txtAdegaJava = new JTextField();
		txtAdegaJava.setBackground(new Color(0, 0, 0));
		txtAdegaJava.setFont(new Font("darloune", Font.BOLD, 24));
		txtAdegaJava.setForeground(new Color(255, 0, 0));
		txtAdegaJava.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdegaJava.setText("ADEGA JAVA\r\n");
		txtAdegaJava.setBounds(0, 0, 320, 51);
		getContentPane().add(txtAdegaJava);
		txtAdegaJava.setColumns(10);
		
		txtDigiteOSeu = new JTextField();
		txtDigiteOSeu.setHorizontalAlignment(SwingConstants.CENTER);
		txtDigiteOSeu.setForeground(new Color(255, 255, 255));
		txtDigiteOSeu.setBackground(new Color(0, 0, 0));
		txtDigiteOSeu.setText("DIGITE O SEU NOME\r\n");
		txtDigiteOSeu.setBounds(-16, 72, 320, 20);
		getContentPane().add(txtDigiteOSeu);
		txtDigiteOSeu.setColumns(10);
		
		JTextArea txtNome = new JTextArea();
		txtNome.setBounds(72, 103, 160, 22);
		getContentPane().add(txtNome);
		
		txtDigiteSeuEndereo = new JTextField();
		txtDigiteSeuEndereo.setHorizontalAlignment(SwingConstants.CENTER);
		txtDigiteSeuEndereo.setText("DIGITE SEU ENDERE\u00C7O\r\n");
		txtDigiteSeuEndereo.setForeground(new Color(255, 255, 255));
		txtDigiteSeuEndereo.setBackground(new Color(0, 0, 0));
		txtDigiteSeuEndereo.setBounds(-16, 149, 320, 20);
		getContentPane().add(txtDigiteSeuEndereo);
		txtDigiteSeuEndereo.setColumns(10);
		
		JTextArea txtEndereco = new JTextArea();
		txtEndereco.setBounds(72, 192, 160, 22);
		getContentPane().add(txtEndereco);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Cliente cliente = new Cliente(txtNome.getText(), txtEndereco.getText()); 
		pedido.setCliente(cliente);
		JFEntrega jfentrega = new JFEntrega(pedido); 
		jfentrega.setVisible(true);
			}
		});
		btnNewButton.setBounds(98, 344, 89, 23);
		getContentPane().add(btnNewButton);
		
		lblValorTotal = new JTextField();
		lblValorTotal.setText("VALOR TOTAL");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorTotal.setForeground(Color.WHITE);
		lblValorTotal.setColumns(10);
		lblValorTotal.setBackground(Color.BLACK);
		lblValorTotal.setBounds(-16, 264, 320, 20);
		getContentPane().add(lblValorTotal);
		
		txtValorTotal = new JTextArea();
		txtValorTotal.setBounds(72, 297, 160, 22);
		getContentPane().add(txtValorTotal);

		
		
	}
	public JFPedido(Pedido pedido) {
		this();
		this.pedido = pedido; 
		txtValorTotal.setText(String.valueOf(this.pedido.getValor()));
		
	}

	
}
