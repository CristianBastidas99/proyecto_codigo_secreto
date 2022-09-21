package co.edu.uniquindio.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desencriptar {

	private String url_arcivo;

	private String nombre_archivo;

	/**
	 * 
	 */
	public Desencriptar() {
		this.url_arcivo = "";
		this.nombre_archivo = "";
	}

	public Desencriptar(String url_arcivo, String nombre_archivo) {
		this.url_arcivo = url_arcivo;
		this.nombre_archivo = nombre_archivo;
	}

	public String ejecutar() {

		String codigo_des = "";

		try {
			File doc = new File(url_arcivo);

			BufferedReader obj = new BufferedReader(new FileReader(doc));

			String strng = obj.readLine();

			int valor = 0;
			Ascii ascii = new Ascii();

			for (int i = 0; i < strng.length(); i++) {

				valor = ascii.obtenerPosicionCaracter(strng.charAt(i))
						- ascii.obtenerPosicionCaracter(nombre_archivo.charAt(i));

				if (valor < 0) {
					valor = 255 + valor;
				}

				codigo_des += ascii.obtenerCaracterPosicion(valor);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Hubo un erro al leer el archivo");
		}

		return codigo_des;
	}

	public String getUrl_arcivo() {
		return url_arcivo;
	}

	public void setUrl_arcivo(String url_arcivo) {
		this.url_arcivo = url_arcivo;
	}

	public String getNombre_archivo() {
		return nombre_archivo;
	}

	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}

}
