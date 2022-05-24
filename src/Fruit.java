import java.util.ArrayList;

/**
 * Representa la entidad Fruta.
 * 
 * @author Alberto Posso Cardona.
 */

public class Fruit {

	/**
	 * Declaraci�n de atributos de clase.
	 */
	String name;
	private Float averageWeight;
	/**
	 * Instanciaci�n del ArrayList para su llenado.
	 * 
	 */
	ArrayList<String> colors;

	/**
	 * M�todo para obtenci�n de atributo publico.
	 * 
	 * @deprecated No es necesario este m�todo ya que el atributo es publico.
	 * @return Lista de colores de una fruta.
	 */
	public ArrayList<String> getColors() {
		return colors;
	}

	/**
	 * M�todo para manipulaci�n de atributo publico.
	 * 
	 * @deprecated No es necesario este m�todo ya que el atributo es publico.
	 * @param name Nombre del Color a manipular sobre la lista.
	 */
	public void setColor(String name) {
		this.colors.add(name);
	}

	/**
	 * M�todo para obtenci�n de atributo privado.
	 * 
	 * @return Peso promedio de la fruta.
	 */
	public Float getAvarageWeight() {
		return averageWeight;
	}

	/**
	 * M�todo para manipulaci�n de atributo privado.
	 * 
	 * @param averageWeight Peso promedio de la fruta a manipular.
	 */
	public void setAvarageWeight(Float averageWeight) {
		this.averageWeight = averageWeight;
	}

}
