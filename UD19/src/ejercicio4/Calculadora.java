package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	public JButton button_7;
	public JButton button_8;
	public JButton button_9;
	public JButton button_C;
	public JButton button_4;
	public JButton button_5;
	public JButton button_6;
	public JButton button_flecha;
	public JButton button_1;
	public JButton button_2;
	public JButton button_3;
	public JButton button_pos_neg;
	public JButton button_coma;
	public JButton button_0;
	public JButton button_suma;
	public JButton button_resta;
	public JButton button_por;
	public JButton button_div;
	public JButton button_equal;
	public String num1;
	public String signo;
	public 	JLabel lblNewLabel;

	public Calculadora() {
		setTitle("Calculadora básica");
		setBounds(500, 500, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		System.out.println(contentPane);

		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Noto Mono", Font.BOLD, 22));
		lblNewLabel.setBackground(new Color(255, 228, 225));
		lblNewLabel.setBounds(222, 43, 218, 25);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Noto Mono", Font.BOLD, 32));
		textField.setSelectionColor(new Color(255, 127, 80));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(146, 79, 294, 64);
		contentPane.add(textField);
		textField.setColumns(10);

		button_7 = new JButton("7");
		setVisible(true);
		button_7.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_7.setBackground(new Color(255, 228, 225));
		button_7.setBounds(146, 170, 66, 58);
		contentPane.add(button_7);
		repaint();
		button_7.addActionListener(numListener);

		button_8 = new JButton("8");
		setVisible(true);
		button_8.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_8.setBackground(new Color(255, 228, 225));
		button_8.setBounds(222, 170, 66, 58);
		contentPane.add(button_8);
		repaint();
		button_8.addActionListener(numListener);

		button_9 = new JButton("9");
		setVisible(true);
		button_9.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_9.setBackground(new Color(255, 228, 225));
		button_9.setBounds(298, 170, 66, 58);
		contentPane.add(button_9);
		repaint();
		button_9.addActionListener(numListener);

		button_C = new JButton("C");
		setVisible(true);
		button_C.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_C.setForeground(new Color(220, 20, 60));
		button_C.setBackground(new Color(255, 228, 225));
		button_C.setBounds(374, 170, 66, 58);
		contentPane.add(button_C);
		repaint();
		button_C.addActionListener(reinicio);

		button_4 = new JButton("4");
		setVisible(true);
		button_4.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_4.setBackground(new Color(255, 228, 225));
		button_4.setBounds(146, 239, 66, 58);
		contentPane.add(button_4);
		repaint();
		button_4.addActionListener(numListener);

		button_5 = new JButton("5");
		setVisible(true);
		button_5.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_5.setBackground(new Color(255, 228, 225));
		button_5.setBounds(222, 239, 66, 58);
		contentPane.add(button_5);
		repaint();
		button_5.addActionListener(numListener);

		button_6 = new JButton("6");
		setVisible(true);
		button_6.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_6.setBackground(new Color(255, 228, 225));
		button_6.setBounds(298, 239, 66, 58);
		contentPane.add(button_6);
		repaint();
		button_6.addActionListener(numListener);

		button_flecha = new JButton("<");
		setVisible(true);
		button_flecha.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_flecha.setForeground(new Color(220, 20, 60));
		button_flecha.setBackground(new Color(255, 228, 225));
		button_flecha.setBounds(374, 239, 66, 58);
		contentPane.add(button_flecha);
		repaint();
		button_flecha.addActionListener(borrar);

		button_1 = new JButton("1");
		button_1.setVisible(true);
		button_1.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_1.setBackground(new Color(255, 228, 225));
		button_1.setBounds(146, 308, 66, 58);
		contentPane.add(button_1);
		repaint();
		button_1.addActionListener(numListener);

		button_2 = new JButton("2");
		button_2.setVisible(true);
		button_2.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_2.setBackground(new Color(255, 228, 225));
		button_2.setBounds(222, 308, 66, 58);
		contentPane.add(button_2);
		repaint();
		button_2.addActionListener(numListener);

		button_3 = new JButton("3");
		button_3.setVisible(true);
		button_3.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_3.setBackground(new Color(255, 228, 225));
		button_3.setBounds(298, 308, 66, 58);
		contentPane.add(button_3);
		repaint();
		button_3.addActionListener(numListener);

		button_pos_neg = new JButton("+-");
		button_pos_neg.setVisible(true);
		button_pos_neg.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_pos_neg.setBackground(new Color(255, 228, 225));
		button_pos_neg.setBounds(146, 377, 66, 58);
		contentPane.add(button_pos_neg);
		repaint();
		button_pos_neg.addActionListener(cambio);

		button_coma = new JButton(",");
		button_coma.setVisible(true);
		button_coma.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_coma.setBackground(new Color(255, 228, 225));
		button_coma.setBounds(222, 377, 66, 58);
		contentPane.add(button_coma);
		repaint();
		button_coma.addActionListener(coma);

		button_0 = new JButton("0");
		button_0.setVisible(true);
		button_0.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_0.setBackground(new Color(255, 228, 225));
		button_0.setBounds(298, 377, 66, 58);
		contentPane.add(button_0);
		repaint();
		button_0.addActionListener(numListener);

		button_suma = new JButton("+");
		button_suma.setVisible(true);
		button_suma.setFont(new Font("Noto Mono", Font.BOLD, 25));
		button_suma.setForeground(new Color(0, 0, 0));
		button_suma.setBackground(new Color(233, 150, 122));
		button_suma.setBounds(146, 446, 66, 58);
		contentPane.add(button_suma);
		repaint();
		button_suma.addActionListener(operator);

		button_resta = new JButton("-");
		button_resta.setVisible(true);
		button_resta.setFont(new Font("Noto Mono", Font.BOLD, 25));
		button_resta.setForeground(new Color(0, 0, 0));
		button_resta.setBackground(new Color(233, 150, 122));
		button_resta.setBounds(222, 446, 66, 58);
		contentPane.add(button_resta);
		repaint();
		button_resta.addActionListener(operator);

		button_por = new JButton("x");
		button_por.setVisible(true);
		button_por.setFont(new Font("Noto Mono", Font.BOLD, 25));
		button_por.setForeground(new Color(0, 0, 0));
		button_por.setBackground(new Color(233, 150, 122));
		button_por.setBounds(298, 446, 66, 58);
		contentPane.add(button_por);
		repaint();
		button_por.addActionListener(operator);

		button_div = new JButton("/");
		button_div.setVisible(true);
		button_div.setFont(new Font("Noto Mono", Font.BOLD, 25));
		button_div.setForeground(new Color(0, 0, 0));
		button_div.setBackground(new Color(233, 150, 122));
		button_div.setBounds(374, 446, 66, 58);
		contentPane.add(button_div);
		repaint();
		button_div.addActionListener(operator);

		button_equal = new JButton("=");
		button_equal.setVisible(true);
		button_equal.setFont(new Font("Noto Mono", Font.BOLD, 22));
		button_equal.setForeground(new Color(220, 20, 60));
		button_equal.setBackground(new Color(255, 228, 225));
		button_equal.setBounds(374, 308, 66, 127);
		contentPane.add(button_equal);
		repaint();
		button_equal.addActionListener(equal);

		ButtonGroup bgroupnum = new ButtonGroup();
		bgroupnum.add(button_0);
		bgroupnum.add(button_1);
		bgroupnum.add(button_2);
		bgroupnum.add(button_3);
		bgroupnum.add(button_4);
		bgroupnum.add(button_5);
		bgroupnum.add(button_6);
		bgroupnum.add(button_7);
		bgroupnum.add(button_8);
		bgroupnum.add(button_9);
		repaint();
	}

	//Evento para la operación
	ActionListener equal=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			makeOperation();
		}
	};	
	ActionListener numListener=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton numero = (JButton) e.getSource(); 			//Coge el botón que es
			textField.setText(textField.getText()+numero.getText()); 
			//El texto para poner en la caja es el texto cogido + el numero que recoge del texto.
		}
	};
	ActionListener operator=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn_signo = (JButton) e.getSource();
			if (num1 == null) {
				num1 = textField.getText(); //Para que el num1 coja el valor que le añade el text
			}else {
				makeOperation();
			}
			textField.setText(""); //Limpiar pantalla
			signo = btn_signo.getText(); //Coge el signo de operación
		}		
	};
	ActionListener borrar=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			/*el substring es una función que tiene el String para coger la cadena de texto, y añadir o quitar el carácter. Desde el punto 0
			 * cogemo todo lo que abarca los números que el usuario añade (de ahí al length) y le restamos 1; es decir, el último carácter puesto.
			 */
			String flecha = textField.getText().substring(0, textField.getText().length()-1);
			textField.setText(flecha);
		}
	};
	ActionListener reinicio=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			num1 = null;
			textField.setText(""); //Vacía la caja de texto
			lblNewLabel.setText(""); //Vacía el label donde sale el resultado
		}		
	};
	ActionListener coma=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText(textField.getText()+"."); //Añade la coma después de coger el número
		}		
	};
	ActionListener cambio=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (textField.getText().isEmpty()) { //Si la caja de texto está vacía, se añade el negativo
				textField.setText("-");			
			}else {
				if (textField.getText().charAt(0) == '-') { //Si el primer carácter del string es el negativo
					String positivo = textField.getText().substring(1, textField.getText().length()); //Se cuenta a partir de la posición 1
					textField.setText(positivo); //Y ese contaje anterior se le añade a la caja de texto(es decir, sin el -)
				} else {
					textField.setText("-"+textField.getText()); //Si no, se añade el negativo y luego el texto que recoge
				}
			}
		}	
	};

	public void makeOperation() {
		if (textField.getText().isEmpty()) {
		}else {
			double num2 = Double.parseDouble(textField.getText());
			double resultado = 0;
			switch (signo) {
			case "+":
				resultado = Double.parseDouble(num1) + num2;
				break;
			case "-":
				resultado = Double.parseDouble(num1) - num2;
				break;
			case "x":
				resultado = Double.parseDouble(num1) * num2;
				break;
			case "/":
					if (num2 == 0){
						JOptionPane.showMessageDialog(lblNewLabel, "No se puede dividir por cero");
					}else {
						resultado = Double.parseDouble(num1) / num2;
				}
					break;
				default:
					break;
				}
				num1 = resultado + "";
				lblNewLabel.setText(resultado + "");
				textField.setText("");
			}
		}
	}	