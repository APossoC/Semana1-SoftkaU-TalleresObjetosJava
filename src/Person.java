
import java.util.Date;

/**
 * Representa la entidad Persona.
 * 
 * @author Alberto Posso Cardona.
 */

public class Person {

	/**
	 * Declaración de atributos de clase.
	 */
	String name;
	String lastName1;
	String lastName2;
	Date dateBirth;
	Float height;

	/**
	 * Método para obtención de atributo publico.
	 * 
	 * @deprecated No es necesario este método ya que el atributo es publico.
	 * @return Nombre de la Persona.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método para manipulación de atributo publico.
	 * 
	 * @deprecated No es necesario este método ya que el atributo es publico.
	 * @param name Nombre del Persona a manipular.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
