
/**
 * Representa la entidad banco.
 * 
 * @author Alberto Posso Cardona.
 */

public class Bank {

	/**
	 * Declaración de atributos de clase.
	 */
	String name;
	protected String internalCode;
	private Integer nit;

	/**
	 * Método para obtención de atributo privado.
	 * 
	 * @return Nit del Banco.
	 */
	public Integer getNit() {
		return nit;
	}

	/**
	 * Método para manipulación de atributo privado.
	 * 
	 * @param nit Nit del Banco a manipular.
	 */
	public void setNit(int nit) {
		this.nit = nit;
	}

	/**
	 * Método para obtención de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @return Código Interno del Banco.
	 */
	public String getInternalCode() {
		return internalCode;
	}

	/**
	 * Método para manipulación de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @param internalCode Código Interno del Banco a manipular.
	 */
	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

}

