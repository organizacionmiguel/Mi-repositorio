	/**
	 * 
	 * @author Miguel
	 *
	 */

public class Persona {
	
	/**
	 * Delcaracion del nombre de la persona en un dato tipo string
	 */
	private String nombre;
	
	/**
	 * Declaracion del sexo de la persona en un dato tipo String
	 */
	private String sexo;
	
	/**
	 * Declaracion de la edad en un dato String
	 */
	private int edad;
	
	
	/**
	 * Constructor de persona 
	 * @param nombre
	 * @param sexo
	 * @param edad
	 */
	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	/**
	 * Metodo getter del nombre de la persona 
	 * @return nombre que es un parametro de tipo String 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo setter del nombre de la persona 
	 * @param nombre es de tipo String 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getter del sexo de la persona
	 * @return sexo de tipo String
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Metodo setter del sexo de la persona 
	 * @param sexo de tipo String
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Metodo getter de la edad de la persona 
	 * @return edad del tipo INT
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Metodo setter de la edad de la persona 
	 * @param edad de tipo int 
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo toString
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "].";
	}
	
	
	
}
