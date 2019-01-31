package com.overnet.interfaces.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Canvas;
import java.awt.Color;

public class MainWindow {

	private JFrame frame;
	private JTextField txtHttps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSayhello = new JButton("get");
		btnSayhello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnSayhello.setBounds(335, 10, 89, 23);
		
		//btnSayhello.addActionListener(l);
		
		
		frame.getContentPane().add(btnSayhello);
		
		txtHttps = new JTextField();
		txtHttps.setText("https://");
		txtHttps.setBounds(52, 11, 273, 20);
		frame.getContentPane().add(txtHttps);
		txtHttps.setColumns(10);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(10, 14, 60, 14);
		frame.getContentPane().add(lblUrl);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.GRAY);
		canvas.setForeground(Color.BLACK);
		canvas.setBounds(10, 42, 414, 188);
		
		
		
		
		frame.getContentPane().add(canvas);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAction = new JMenuItem("Action");
		mnFile.add(mntmAction);
	}
}
