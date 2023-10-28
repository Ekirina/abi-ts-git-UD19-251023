package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

public class Laspeliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField textField = new JTextField();


	public Laspeliculas() {
		setTitle("Películas");
		setBounds(900, 400, 650, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(221, 221, 221));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		System.out.println(contentPane);
		
		JLabel enunciado = new JLabel ("Introduce una película");
		enunciado.setFont(new Font("Tahoma", Font.BOLD, 14));
		enunciado.setForeground(new Color(64, 0, 128));
		enunciado.setBounds(74, 33, 185, 48);
		contentPane.add(enunciado);
		textField.setBackground(Color.WHITE);
		
		textField.setColumns(10);
		contentPane.add(textField);
		textField.setBounds(95, 92, 126, 26);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		textField.setLayout(null);
	
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(64, 0, 128));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setBounds(107, 146, 100, 26);
		contentPane.add(btnNewButton);
		
		JLabel enunciadoBox = new JLabel ("Listado de películas");
		enunciadoBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		enunciadoBox.setForeground(new Color(64, 0, 128));
		enunciadoBox.setBounds(269, 33, 140, 48);
		contentPane.add(enunciadoBox);	
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(269, 92, 119, 26);
		contentPane.add(comboBox);
		comboBox.addItem("Mars Attack");
		ActionListener al=new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Película añadida: " + textField.getText());
				comboBox.addItem(textField.getText());
				if (textField.getText().equals("")) {
					comboBox.removeItem(textField.getText());
				}
			}		
		};
		btnNewButton.addActionListener(al);

		}
}
