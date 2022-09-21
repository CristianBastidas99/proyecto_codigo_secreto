/**
 * 
 */
package co.edu.uniquindio.proyecto.modelo;

import javax.swing.JOptionPane;

/**
 * @author Cristian
 *
 */
public class Mensaje {

	private Encriptar encriptar;

	private Desencriptar desencriptar;

	private static String URL_ARCHIVO = "C:\\Users\\Acer\\workspace_ArquitecturaComputadores\\proyecto_codigo_secreto\\src\\co\\edu\\uniquindio\\proyecto\\archivos\\";

	/**
	 * 
	 */
	public Mensaje() {
		// TODO Auto-generated constructor stub
		this.encriptar = new Encriptar();
		this.desencriptar = new Desencriptar();
	}

	public static void main(String[] args) {

		Mensaje mensaje = new Mensaje();

		String strng = "JORGEGUADAL";
		String nombre = "COMPUTADORA";

		String salida = mensaje.encriptarMensaje(strng, nombre);

		System.out.println(salida);

		salida = mensaje.desencriptarMensaje(nombre);

		System.out.println(salida);
	}

	public String encriptarMensaje(String mensaje, String nombre_archivo) {

		String mensajeSalida = "No se pudo Encriptar";

		if (verificarValidezCampos(mensaje) && verificarValidezCampos(nombre_archivo)) {

			this.encriptar = new Encriptar(URL_ARCHIVO + nombre_archivo + ".txt", nombre_archivo, mensaje);
			mensajeSalida = this.encriptar.ejecutar();
		}
		return mensajeSalida;
	}

	public String desencriptarMensaje(String nombre_archivo) {
		String mensajeSalida = "El mensaje no se pudo Desencriptar";

		if (verificarValidezCampos(nombre_archivo)) {
			this.desencriptar = new Desencriptar(URL_ARCHIVO + nombre_archivo + ".txt", nombre_archivo);
			mensajeSalida = this.desencriptar.ejecutar();
		}
		return mensajeSalida;
	}

	public boolean verificarValidezCampos(String valor) {

		boolean bandera = false;
		String mensajeSalida = "Por favor verifique que los campos esten llenos";

		if (valor != null) {
			if (!valor.isEmpty()) {
				mensajeSalida = "EL numero de caracteres en los campos no puede exeder los 14 caracteres";
				if (valor.length() < 15) {
					mensajeSalida = "Los campos no puede tener espacios ni saltos de minea";
					if (!valor.contains(" ") && !valor.contains("\n")) {
						mensajeSalida = "Los campos no puede tener numeros";
						if (!valor.contains("0") && !valor.contains("1") && !valor.contains("2") && !valor.contains("3")
								&& !valor.contains("4") && !valor.contains("5") && !valor.contains("6")
								&& !valor.contains("7") && !valor.contains("8") && !valor.contains("9")) {
							mensajeSalida = "";
							bandera = true;
						}
					}
				}
			}
		}

		if (!mensajeSalida.isEmpty()) {
			JOptionPane.showMessageDialog(null, mensajeSalida);
		}

		return bandera;
	}

}
