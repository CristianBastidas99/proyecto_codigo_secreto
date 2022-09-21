package co.edu.uniquindio.proyecto.interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import co.edu.uniquindio.proyecto.modelo.Mensaje;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CodigoSecreto implements ActionListener{

	private JFrame frame;
	private JTextField txf_nombre_archivo;
	private JTextField txf_mensaje;
	private JButton btn_encriptar;
	private JButton btn_desencriptar;
	private Mensaje mensaje;

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
		
		mensaje = new Mensaje();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 378);
		frame.setTitle("Codigo Secreto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo Secreto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(178, 10, 165, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Archivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(113, 114, 135, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txf_nombre_archivo = new JTextField();
		txf_nombre_archivo.setBounds(287, 114, 96, 19);
		frame.getContentPane().add(txf_nombre_archivo);
		txf_nombre_archivo.setColumns(10);
		
		txf_mensaje = new JTextField();
		txf_mensaje.setColumns(10);
		txf_mensaje.setBounds(287, 167, 96, 19);
		frame.getContentPane().add(txf_mensaje);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mensaje");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(113, 167, 135, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		btn_encriptar = new JButton("Encriptar");
		btn_encriptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_encriptar.setBounds(132, 284, 118, 21);
		btn_encriptar.addActionListener(this);
		frame.getContentPane().add(btn_encriptar);
		
		btn_desencriptar = new JButton("Desencriptar");
		btn_desencriptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_desencriptar.setBounds(267, 284, 118, 21);
		btn_desencriptar.addActionListener(this);
		frame.getContentPane().add(btn_desencriptar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn_encriptar) {
			String salida = mensaje.encriptarMensaje(txf_mensaje.getText(), txf_nombre_archivo.getText());
			txf_mensaje.setText(salida);
		}else if(e.getSource() == btn_desencriptar) {
			String salida = mensaje.desencriptarMensaje(txf_nombre_archivo.getText());
			txf_mensaje.setText(salida);
		}
	}
}
