/**
 * 
 */
package co.edu.uniquindio.proyecto.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Cristian
 *
 */
public class Encriptar {

	private String url_arcivo;

	private String nombre_archivo;

	private String contenido_archivo;

	/**
	 * 
	 */
	public Encriptar() {
		this.url_arcivo = "";
		this.nombre_archivo = "";
		this.contenido_archivo = "";
	}

	/**
	 * @param url_arcivo
	 * @param nombre_archivo
	 * @param palabra_clave
	 */
	public Encriptar(String url_arcivo, String nombre_archivo, String contenido_archivo) {
		this.url_arcivo = url_arcivo;
		this.nombre_archivo = nombre_archivo;
		this.contenido_archivo = contenido_archivo;
	}

	public String ejecutar() {

		String codigo_enc = "";

		try {
			int valor = 0;
			Ascii ascii = new Ascii();

			for (int i = 0; i < contenido_archivo.length(); i++) {

				valor = ascii.obtenerPosicionCaracter(contenido_archivo.charAt(i))
						+ ascii.obtenerPosicionCaracter(nombre_archivo.charAt(i));

				if (valor > 255) {
					valor = valor - 255;
				}

				codigo_enc += ascii.obtenerCaracterPosicion(valor);

			}

			File file = new File(url_arcivo);
			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(codigo_enc);
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Hubo un erro al escribir el archivo");
		}

		return codigo_enc;
	}

	/**
	 * @return the url_arcivo
	 */
	public String getUrl_arcivo() {
		return url_arcivo;
	}

	/**
	 * @param url_arcivo the url_arcivo to set
	 */
	public void setUrl_arcivo(String url_arcivo) {
		this.url_arcivo = url_arcivo;
	}

	/**
	 * @return the nombre_archivo
	 */
	public String getNombre_archivo() {
		return nombre_archivo;
	}

	/**
	 * @param nombre_archivo the nombre_archivo to set
	 */
	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}

	/**
	 * @return the palabra_clave
	 */
	public String getPalabra_clave() {
		return contenido_archivo;
	}

	/**
	 * @param palabra_clave the palabra_clave to set
	 */
	public void setPalabra_clave(String palabra_clave) {
		this.contenido_archivo = palabra_clave;
	}

}