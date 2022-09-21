package co.edu.uniquindio.proyecto.interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CodigoSecreto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodigoSecreto window = new CodigoSecreto();
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
	public CodigoSecreto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Codigo Secreto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
