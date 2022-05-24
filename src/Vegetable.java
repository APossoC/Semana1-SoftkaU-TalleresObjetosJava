/**
 * Representa la entidad Vegetales.
 * 
 * @author Alberto Posso Cardona.
 */

public class Vegetable {
	
	/**
	 * Declaraci�n de atributos de clase.
	 */
	protected String name;
	private String taste;
	
	
	
	/**
	 * M�todo para obtenci�n de atributo privado.
	 * 
	 * @return Sabor del Vegetal
	 */
	public String getTaste() {
		return taste;
	}
	
	/**
	 * M�todo para manipulaci�n de atributo privado.
	 * 
	 * @param taste Sabor del Vegetal a manipular.
	 */
	public void setTaste(String taste) {
		this.taste = taste;
	}	
	
	/**
	 * * M�todo para obtenci�n de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @return Nombre del Vegetal.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�todo para manipulaci�n de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @param name Nombre del Vegetal a manipular.
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
