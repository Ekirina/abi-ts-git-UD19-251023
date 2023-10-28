package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Elpanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField textField = new JTextField();

	public Elpanel() {
		setTitle("Bienvenido/a");
		setBounds(200, 200, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		System.out.println(contentPane);
		
		textField.setColumns(10);
		contentPane.add(textField);
		textField.setBounds(95, 50, 86, 26);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		textField.setLayout(null);
	
		JButton btnNewButton = new JButton("¡Dale!");
		btnNewButton.setBounds(92, 90, 89, 23);
		contentPane.add(btnNewButton);

		ActionListener al=new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + textField.getText() +"!" );
			}		
		};
		btnNewButton.addActionListener(al);		
		}
	}	
	
	

