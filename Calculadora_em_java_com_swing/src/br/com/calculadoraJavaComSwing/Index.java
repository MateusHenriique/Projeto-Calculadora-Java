package br.com.calculadoraJavaComSwing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Index extends JFrame {

	private String operation;
	private JLabel lblResultado;
	private JLabel lblMaxNumSize;
	private Float number1;
	private Float number2;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 366, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultado.setBounds(10, 33, 302, 57);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 50));
		panel.add(lblResultado);
		
		lblMaxNumSize = new JLabel("");
		lblMaxNumSize.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxNumSize.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMaxNumSize.setBounds(10, 4, 302, 19);
		panel.add(lblMaxNumSize);
		
		JLabel lblOperacao = new JLabel("");
		lblOperacao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperacao.setBounds(322, 65, 20, 13);
		panel.add(lblOperacao);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 124, 366, 339);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = Float.parseFloat(lblResultado.getText());
				Float result = Calculate.operation(operation, number1, number2);
				lblOperacao.setText("");
				lblResultado.setText(Float.toString(result));
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.setBounds(291, 215, 65, 115);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1_2 = new JButton("+");
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Float.parseFloat(lblResultado.getText());
				lblResultado.setText("");
				operation = "+";
				lblOperacao.setText(operation);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1_2.setBounds(291, 153, 65, 52);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("-");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!lblResultado.getText().isEmpty()) {
					number1 = Float.parseFloat(lblResultado.getText());
					lblResultado.setText("");
					operation = "-";
					lblOperacao.setText(operation);
				}else {
					
				}
				
			}
		});
		btnNewButton_1_2_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1_2_1.setBounds(291, 91, 65, 52);
		panel_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("*");
		btnNewButton_1_2_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Float.parseFloat(lblResultado.getText());
				lblResultado.setText("");
				operation = "*";
				lblOperacao.setText(operation);
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1_2_2.setBounds(291, 10, 65, 71);
		panel_1.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_3 = new JButton("/");
		btnNewButton_1_2_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Float.parseFloat(lblResultado.getText());
				lblResultado.setText("");
				operation = "/";
				lblOperacao.setText(operation);
			}
		});
		btnNewButton_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1_2_3.setBounds(198, 10, 83, 71);
		panel_1.add(btnNewButton_1_2_3);
		
		JButton btnNumber9 = new JButton("9");
		btnNumber9.setBackground(new Color(255, 255, 255));
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(9);
			}
		});
		btnNumber9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber9.setBounds(198, 91, 83, 52);
		panel_1.add(btnNumber9);
		
		JButton btnNumber8 = new JButton("8");
		btnNumber8.setBackground(new Color(255, 255, 255));
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(8);
			}
		});
		btnNumber8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber8.setBounds(105, 91, 83, 52);
		panel_1.add(btnNumber8);
		
		JButton btnNumber7 = new JButton("7");
		btnNumber7.setBackground(new Color(255, 255, 255));
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(7);
			}
		});
		btnNumber7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber7.setBounds(10, 91, 83, 52);
		panel_1.add(btnNumber7);
		
		JButton btnNumber6 = new JButton("6");
		btnNumber6.setBackground(new Color(255, 255, 255));
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(6);
			}
		});
		btnNumber6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber6.setBounds(198, 153, 83, 52);
		panel_1.add(btnNumber6);
		
		JButton btnNumber5 = new JButton("5");
		btnNumber5.setBackground(new Color(255, 255, 255));
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(5);
			}
		});
		btnNumber5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber5.setBounds(105, 153, 83, 52);
		panel_1.add(btnNumber5);
		
		JButton btnNumber4 = new JButton("4");
		btnNumber4.setBackground(new Color(255, 255, 255));
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(4);
			}
		});
		btnNumber4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber4.setBounds(10, 153, 83, 52);
		panel_1.add(btnNumber4);
		
		JButton btnNumber3 = new JButton("3");
		btnNumber3.setBackground(new Color(255, 255, 255));
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(3);
			}
		});
		btnNumber3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber3.setBounds(198, 215, 83, 52);
		panel_1.add(btnNumber3);
		
		JButton btnNumber2 = new JButton("2");
		btnNumber2.setBackground(new Color(255, 255, 255));
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(2);
			}
		});
		btnNumber2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber2.setBounds(105, 215, 83, 52);
		panel_1.add(btnNumber2);
		
		JButton btnNumber1 = new JButton("1");
		btnNumber1.setBackground(new Color(255, 255, 255));
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(1);
			}
		});
		btnNumber1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber1.setBounds(10, 215, 83, 52);
		panel_1.add(btnNumber1);
		
		JButton btnNumber0 = new JButton("0");
		btnNumber0.setBackground(new Color(255, 255, 255));
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxNumSizeValidation(0);
			}
		});
		btnNumber0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNumber0.setBounds(10, 277, 271, 52);
		panel_1.add(btnNumber0);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteLastNumber();
			}
		});
		btnDel.setBackground(new Color(255, 255, 255));
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDel.setBounds(105, 10, 83, 71);
		panel_1.add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 255, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("");
				operation = null;
				lblOperacao.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnClear.setBounds(10, 10, 83, 71);
		panel_1.add(btnClear);
	}
	
	private void maxNumSizeValidation(int numButtonTxt) {
		if (lblResultado.getText().length() < 11) {
			lblResultado.setText(lblResultado.getText() + numButtonTxt);
			lblMaxNumSize.setText("");
		}else {
			lblMaxNumSize.setText("Numero maximo atingido Apage ou clique em um operador");
		}
	}
	
	private void deleteLastNumber() {
		String del = lblResultado.getText();
		String newDel = "";
		for (int i = 0; i < del.length() - 1; i++) {
			newDel = newDel + del.charAt(i);
		}
		lblResultado.setText(newDel);
		
	}
	
}
