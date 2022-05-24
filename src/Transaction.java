

import java.util.Date;

/**
 * Representa la entidad Transaccion.
 * 
 * @author Alberto Posso Cardona.
 */
public class Transaction {	

	/**
	 * Declaración de atributos de clase.
	 */
	String name;
	private Date movDate;
	
	/**
	 * Método para obtención de atributo publico.
	 * 
	 * @return Fecha de la transaccion.
	 */
	public Date getMovDate() {
		return movDate;
	}
	
	/**
	 * Método para manipulación de atributo publico.
	 * 
	 * @param movDate Fecha de la transaccion a manipular.
	 */
	public void setMovDate(Date movDate) {
		this.movDate = movDate;
	}
	
	

}
