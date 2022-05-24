
import java.util.Date;

/**
 * Representa la entidad Persona.
 * 
 * @author Alberto Posso Cardona.
 */

public class Person {

	/**
	 * Declaraci�n de atributos de clase.
	 */
	String name;
	String lastName1;
	String lastName2;
	Date dateBirth;
	Float height;

	/**
	 * M�todo para obtenci�n de atributo publico.
	 * 
	 * @deprecated No es necesario este m�todo ya que el atributo es publico.
	 * @return Nombre de la Persona.
	 */
	public String getName() {
		return name;
	}

	/**
	 * M�todo para manipulaci�n de atributo publico.
	 * 
	 * @deprecated No es necesario este m�todo ya que el atributo es publico.
	 * @param name Nombre del Persona a manipular.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
