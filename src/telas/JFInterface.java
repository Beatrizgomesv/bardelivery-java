package telas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFInterface extends JFrame {
	private JTextField txtAdegasBar;
	private JTextField txtSejaBemVindo;
	public static void main(String[] args) {
		
		JFInterface jf = new JFInterface();
		jf.setVisible(true);
	}
	/**
	 * Create the panel.
	 */
	public JFInterface() {
		getContentPane().setBackground(Color.BLACK);
		setBackground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
		
		txtAdegasBar = new JTextField();
		txtAdegasBar.setForeground(new Color(255, 0, 0));
		txtAdegasBar.setFont(new Font("darloune", Font.BOLD, 27));
		txtAdegasBar.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdegasBar.setText("ADEGA  JAVA");
		txtAdegasBar.setBackground(new Color(0, 0, 0));
		txtAdegasBar.setBounds(0, 165, 313, 90);
		getContentPane().add(txtAdegasBar);
		txtAdegasBar.setColumns(10);
		
		txtSejaBemVindo = new JTextField();
		txtSejaBemVindo.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSejaBemVindo.setForeground(new Color(255, 255, 255));
		txtSejaBemVindo.setBackground(new Color(0, 0, 0));
		txtSejaBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		txtSejaBemVindo.setText("SEJA BEM VINDO A");
		txtSejaBemVindo.setBounds(0, 115, 313, 57);
		getContentPane().add(txtSejaBemVindo);
		txtSejaBemVindo.setColumns(10);
		
		Button button = new Button("Entrar");
		button.setBackground(new Color(255, 255, 255));
		button.setForeground(new Color(0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFMenu jfmenu = new JFMenu();
			jfmenu.setVisible(true);
			}
		});
		button.setBounds(108, 295, 86, 22);
		getContentPane().add(button);

	}
}
