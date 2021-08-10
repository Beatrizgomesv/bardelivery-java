package telas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import entidades.Bebida;
import entidades.Menu;
import entidades.Pedido;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;

public class JFMenu extends JFrame {
	private JTextField txtAdegaJava;
	private JTable tbMenu;
	private JTextField txtProduto;
	private JTextField txtQuantidade;
	private JLabel lblNewLabel;
	private JButton btnComprar;
	private Menu menu = new Menu(); 
	/**
	 * Create the panel.
	 */

	public JFMenu() {
		getContentPane().setBackground(Color.BLACK);
		setBackground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
		
		txtAdegaJava = new JTextField();
		txtAdegaJava.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdegaJava.setFont(new Font("darloune", Font.BOLD, 24));
		txtAdegaJava.setForeground(new Color(255, 0, 0));
		txtAdegaJava.setText("ADEGA JAVA");
		txtAdegaJava.setBackground(new Color(0, 0, 0));
		txtAdegaJava.setBounds(0, 0, 320, 51);
		getContentPane().add(txtAdegaJava);
		txtAdegaJava.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 62, 300, 188);
		getContentPane().add(scrollPane);
		
		tbMenu = new JTable();
		scrollPane.setViewportView(tbMenu);
		
		txtProduto = new JTextField();
		txtProduto.setText("faz um pix");
		txtProduto.setBounds(10, 291, 300, 20);
		getContentPane().add(txtProduto);
		txtProduto.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(76, 322, 86, 20);
		getContentPane().add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		lblNewLabel = new JLabel("Quantidade");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 325, 67, 14);
		getContentPane().add(lblNewLabel);
		
		btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer quantidade = Integer.valueOf(txtQuantidade.getText());
				Bebida bebida = menu.getBebidaByNome(txtProduto.getText());
				Pedido pedido = new Pedido(quantidade * bebida.getPreco(), Map.of(bebida, quantidade));
				JFPedido jfpedido = new JFPedido(pedido);
				jfpedido.setVisible(true);
			}
		});
		btnComprar.setBounds(221, 321, 89, 23);
		getContentPane().add(btnComprar);

	}

}
