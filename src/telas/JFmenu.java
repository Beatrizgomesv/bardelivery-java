package telas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import entidades.Menu;

import javax.swing.JTable;

public class JFmenu extends JFrame {
	Menu menu = new Menu();
	private Object[][] linhas = (menu.bebidas.stream().map(bebida->new Object[] {bebida.getNome(),bebida.getPreco(),bebida.getTipo()}).toArray(Object[][]::new));
	public JFmenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 434, 261);
		contentPane.add(scrollPane);
		String[] colunas = { "Bebida", "Preço", "Tipo" };
		table = new JTable(linhas,colunas);
		scrollPane.setViewportView(table);
	
	}

	
	
	
	private JPanel contentPane;
	private JTable table;

}
