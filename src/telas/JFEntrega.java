package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import entidades.Pedido;

public class JFEntrega extends JFrame {
	private JTextField txtAdegaJava;
	private JTextField txtItens;
	private JTextField txtItem;
	private JTextField txtValorTotal;
	private JTextField txtTotalValor;
	private JTextField txtStatus;
	private JTextField txtEntrega;

	/**
	 * Create the panel.
	 */
	private Pedido pedido;
	public JFEntrega() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		txtAdegaJava = new JTextField();
		txtAdegaJava.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdegaJava.setText("ADEGA JAVA");
		txtAdegaJava.setFont(new Font("darloune", Font.BOLD, 25));
		txtAdegaJava.setForeground(Color.RED);
		txtAdegaJava.setBackground(Color.BLACK);
		txtAdegaJava.setBounds(0, 0, 304, 51);
		getContentPane().add(txtAdegaJava);
		txtAdegaJava.setColumns(10);
		
		txtItens = new JTextField();
		txtItens.setHorizontalAlignment(SwingConstants.CENTER);
		txtItens.setText("ITENS");
		txtItens.setBounds(97, 62, 86, 20);
		getContentPane().add(txtItens);
		txtItens.setColumns(10);
		
		txtItem = new JTextField();
		txtItem.setHorizontalAlignment(SwingConstants.CENTER);
		txtItem.setForeground(Color.BLACK);
		txtItem.setBackground(Color.WHITE);
		txtItem.setBounds(10, 102, 284, 85);
		getContentPane().add(txtItem);
		txtItem.setColumns(10);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setText("VALOR TOTAL");
		txtValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorTotal.setColumns(10);
		txtValorTotal.setBounds(97, 215, 86, 20);
		getContentPane().add(txtValorTotal);
		
		txtTotalValor = new JTextField();
		txtTotalValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalValor.setBackground(Color.WHITE);
		txtTotalValor.setForeground(Color.BLACK);
		txtTotalValor.setColumns(10);
		txtTotalValor.setBounds(10, 246, 284, 20);
		getContentPane().add(txtTotalValor);
		
		txtStatus = new JTextField();
		txtStatus.setText("STATUS");
		txtStatus.setHorizontalAlignment(SwingConstants.CENTER);
		txtStatus.setColumns(10);
		txtStatus.setBounds(97, 277, 86, 20);
		getContentPane().add(txtStatus);
		
		txtEntrega = new JTextField();
		txtEntrega.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntrega.setBackground(Color.WHITE);
		txtEntrega.setForeground(Color.BLACK);
		txtEntrega.setColumns(10);
		txtEntrega.setBounds(10, 315, 284, 20);
		getContentPane().add(txtEntrega);

	}
	public JFEntrega(Pedido pedido) {
		this();
		this.pedido = pedido; 
		this.txtTotalValor.setText(String.valueOf(this.pedido.getValor()));
		this.txtEntrega.setText(this.pedido.getStatus().toString());
		StringBuilder str = new StringBuilder();
		pedido.getItens().keySet().stream().forEach(item -> { 
		str.append(pedido.getItens().get(item) + "x" + " - " + item.getNome());
		});
		txtItem.setText(str.toString());
	}
}
