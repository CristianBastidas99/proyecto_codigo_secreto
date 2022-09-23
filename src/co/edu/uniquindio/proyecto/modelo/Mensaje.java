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

	private static String URL_ARCHIVO = System.getenv("LOCALAPPDATA") + "\\";

	/**
	 * 
	 */
	public Mensaje() {
		// TODO Auto-generated constructor stub
		this.encriptar = new Encriptar();
		this.desencriptar = new Desencriptar();
	}

	/**
	 * Metodo que toma el nombre del archivo y el mensaje y lo encripta, guardandolo en un archivo con el nombre especificado
	 * @param mensaje Es el mensaje que se desea encriptar
	 * @param nombre_archivo Es el nombre del archivo que se desea 
	 * @return Una cadena de caracteres que son el mensjae encriptado
	 */
	public String encriptarMensaje(String mensaje, String nombre_archivo) {

		String mensajeSalida = "No se pudo Encriptar";//En caso de no cumplir con los if se pondra este mensaje de error

		if (verificarValidezCampos(mensaje) && verificarValidezCampos(nombre_archivo)) {//Verifica si cumple con las condiciones de la cadena
			if (mensaje.length() == nombre_archivo.length()) {//Si las cadenas son de longitud igual entonces entra

				this.encriptar = new Encriptar(URL_ARCHIVO + nombre_archivo + ".txt", nombre_archivo, mensaje);//Se inicializa la variable Encriptar con los valores correspondientes
				mensajeSalida = this.encriptar.ejecutar();//Haciendo uso del metodo ejecutar se encripta el mensaje
			}else {
				JOptionPane.showMessageDialog(null, "Los campos deben tener la misma longitud");//Si no cumple con la longitud salta este mensaje de error
			}
		}
		return mensajeSalida;//Retorna la cadena
	}

	/**
	 * Metodo que toma el nombre del archivo y lo busca en la crpeda predefinida para desencriptar el mensaje que posee
	 * @param nombre_archivo Es el nombre del archivo que se desea 
	 * @return Una cadena de caracteres con e mensaje origina desencriptado
	 */
	public String desencriptarMensaje(String nombre_archivo) {
		String mensajeSalida = "El mensaje no se pudo Desencriptar";

		if (verificarValidezCampos(nombre_archivo)) {
			this.desencriptar = new Desencriptar(URL_ARCHIVO + nombre_archivo + ".txt", nombre_archivo);
			mensajeSalida = this.desencriptar.ejecutar();
		}
		return mensajeSalida;
	}

	
	/**
	 * Este metodo revisa si la cadena de caracteres cumple con todas las condiciones para proceder a encriptar o desencriptar
	 * @param valor Es la cadena de caracteres a evaluar
	 * @return Un valor booleano true si la cadena cumple con las condiciones, de o contrario false.
	 */
	public boolean verificarValidezCampos(String valor) {

		boolean bandera = false; //Se inicializa el valor en falso
		String mensajeSalida = "El valor de los campos no puede ser nulo";//Inicia el mensaje de error por si no cumple la siguiente condicion

		if (valor != null) {//Si la cadena no es nula entra
			mensajeSalida = "Por favor verifique que los campos esten llenos";//El mensaje de error se cambia para la siguiente condicion
			if (!valor.isEmpty()) {//Si la cadena no esta vacia entra
				mensajeSalida = "EL numero de caracteres en los campos no puede exeder los 14 caracteres";//El mensaje de error se cambia para la siguiente condicion
				if (valor.length() < 15) {// Si la longitud de la cadena es menor a 15 entra
					mensajeSalida = "Los campos no puede tener espacios ni saltos de minea";//El mensaje de error se cambia para la siguiente condicion
					if (!valor.contains(" ") && !valor.contains("\n")) {//Si la cadena no contiene espacios o saltos de linea entra
						mensajeSalida = "Los campos no puede tener numeros";//El mensaje de error se cambia para la siguiente condicion
						if (!valor.contains("0") && !valor.contains("1") && !valor.contains("2") && !valor.contains("3")
								&& !valor.contains("4") && !valor.contains("5") && !valor.contains("6")
								&& !valor.contains("7") && !valor.contains("8") && !valor.contains("9")) {//Si la cadena no contiene numeros entra
							mensajeSalida = "";//El mensaje de error se vuelve vacio si cumple con todas las condiciones
							bandera = true;//El valor es verdadero si paso todas las condiciones
						}
					}
				}
			}
		}

		if (!mensajeSalida.isEmpty()) {//Si el mensaje de error no esta vacio entra
			JOptionPane.showMessageDialog(null, mensajeSalida);//E imprime el mensaje con ayuda de JOptionPane, que es un mensaje flotante
		}

		return bandera;//Retorna la bandera
	}

}
