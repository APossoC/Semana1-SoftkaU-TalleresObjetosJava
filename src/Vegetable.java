/**
 * Representa la entidad Vegetales.
 * 
 * @author Alberto Posso Cardona.
 */

public class Vegetable {
	
	/**
	 * Declaración de atributos de clase.
	 */
	protected String name;
	private String taste;
	
	
	
	/**
	 * Método para obtención de atributo privado.
	 * 
	 * @return Sabor del Vegetal
	 */
	public String getTaste() {
		return taste;
	}
	
	/**
	 * Método para manipulación de atributo privado.
	 * 
	 * @param taste Sabor del Vegetal a manipular.
	 */
	public void setTaste(String taste) {
		this.taste = taste;
	}	
	
	/**
	 * * Método para obtención de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @return Nombre del Vegetal.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Método para manipulación de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @param name Nombre del Vegetal a manipular.
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
