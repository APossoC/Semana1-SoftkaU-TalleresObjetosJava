
/**
 * Representa la entidad banco.
 * 
 * @author Alberto Posso Cardona.
 */

public class Bank {

	/**
	 * Declaraci�n de atributos de clase.
	 */
	String name;
	protected String internalCode;
	private Integer nit;

	/**
	 * M�todo para obtenci�n de atributo privado.
	 * 
	 * @return Nit del Banco.
	 */
	public Integer getNit() {
		return nit;
	}

	/**
	 * M�todo para manipulaci�n de atributo privado.
	 * 
	 * @param nit Nit del Banco a manipular.
	 */
	public void setNit(int nit) {
		this.nit = nit;
	}

	/**
	 * M�todo para obtenci�n de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @return C�digo Interno del Banco.
	 */
	public String getInternalCode() {
		return internalCode;
	}

	/**
	 * M�todo para manipulaci�n de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @param internalCode C�digo Interno del Banco a manipular.
	 */
	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

}

