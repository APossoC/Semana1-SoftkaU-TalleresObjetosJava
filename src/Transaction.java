

import java.util.Date;

/**
 * Representa la entidad Transaccion.
 * 
 * @author Alberto Posso Cardona.
 */
public class Transaction {	

	/**
	 * Declaraci�n de atributos de clase.
	 */
	String name;
	private Date movDate;
	
	/**
	 * M�todo para obtenci�n de atributo publico.
	 * 
	 * @return Fecha de la transaccion.
	 */
	public Date getMovDate() {
		return movDate;
	}
	
	/**
	 * M�todo para manipulaci�n de atributo publico.
	 * 
	 * @param movDate Fecha de la transaccion a manipular.
	 */
	public void setMovDate(Date movDate) {
		this.movDate = movDate;
	}
	
	

}
