import java.util.ArrayList;

/**
 * Representa la entidad Fruta.
 * 
 * @author Alberto Posso Cardona.
 */

public class Fruit {

	/**
	 * Declaración de atributos de clase.
	 */
	String name;
	private Float averageWeight;
	/**
	 * Instanciación del ArrayList para su llenado.
	 * 
	 */
	ArrayList<String> colors;

	/**
	 * Método para obtención de atributo publico.
	 * 
	 * @deprecated No es necesario este método ya que el atributo es publico.
	 * @return Lista de colores de una fruta.
	 */
	public ArrayList<String> getColors() {
		return colors;
	}

	/**
	 * Método para manipulación de atributo publico.
	 * 
	 * @deprecated No es necesario este método ya que el atributo es publico.
	 * @param name Nombre del Color a manipular sobre la lista.
	 */
	public void setColor(String name) {
		this.colors.add(name);
	}

	/**
	 * Método para obtención de atributo privado.
	 * 
	 * @return Peso promedio de la fruta.
	 */
	public Float getAvarageWeight() {
		return averageWeight;
	}

	/**
	 * Método para manipulación de atributo privado.
	 * 
	 * @param averageWeight Peso promedio de la fruta a manipular.
	 */
	public void setAvarageWeight(Float averageWeight) {
		this.averageWeight = averageWeight;
	}

}
