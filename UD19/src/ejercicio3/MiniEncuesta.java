package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JButton;

public class MiniEncuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MiniEncuesta() {
		setTitle("Mini encuesta");
		setBounds(900, 500, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		System.out.println(contentPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(61, 85, 111, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("Windows");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(61, 122, 111, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setActionCommand("Linux");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(61, 163, 111, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand("Mac");
		
		ButtonGroup bgroupsystem = new ButtonGroup();
		bgroupsystem.add(rdbtnNewRadioButton);
		bgroupsystem.add(rdbtnNewRadioButton_1);
		bgroupsystem.add(rdbtnNewRadioButton_2);
	
		JCheckBox chckbxProgram = new JCheckBox("Programación", false);
		chckbxProgram.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxProgram.setBounds(255, 85, 122, 23);
		contentPane.add(chckbxProgram);
		
		JCheckBox chckbxDesign = new JCheckBox("Diseño gráfico", false);
		chckbxDesign.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxDesign.setBounds(255, 122, 122, 23);
		contentPane.add(chckbxDesign);
		
		JCheckBox chckbxAdmin = new JCheckBox("Administración", false);
		chckbxAdmin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxAdmin.setBounds(255, 163, 122, 23);
		contentPane.add(chckbxAdmin);
				
		
		JLabel lblNewLabel = new JLabel("Sistema operativo:");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(61, 37, 134, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tus especialidades:");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(255, 37, 134, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas al ordenador");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(154, 193, 134, 41);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setVisible(true);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(341, 242, 69, 34);
		contentPane.add(btnNewButton);
		
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setMajorTickSpacing(DISPOSE_ON_CLOSE);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(121, 231, 210, 59);
		contentPane.add(slider);
		
		ActionListener al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean program = chckbxProgram.isSelected();
				boolean design = chckbxDesign.isSelected();
				boolean admin = chckbxAdmin.isSelected();
				String system = bgroupsystem.getSelection().getActionCommand();
				int horas = slider.getValue();

				JOptionPane.showMessageDialog(null, "Programación: " + program + ". Diseño gráfico: "+ design + ". Administración: " 
				+ admin + ". Sistema operativo: " + system + ". Horas en el ordenador: " + horas);
			}
		};
	
			btnNewButton.addActionListener(al);	}
}

