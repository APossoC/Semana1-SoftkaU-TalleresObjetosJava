
/**
 * Representa la diferentes cuentas bancarias.
 * 
 * @author Alberto Posso Cardona
 */

public class AccountBank {

	/**
	 * Declaración de atributos de clase
	 */
	private int accountNumber;
	protected Boolean activated;

	/**
	 * Método para obtención de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @return Estado de la cuenta.
	 */
	public Boolean getActivated() {
		return activated;
	}

	/**
	 * Método para manipulación de atributo protegido en caso de implementar nuevos
	 * paquetes.
	 * 
	 * @param activated Estado de la cuenta a manipular.
	 */
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	/**
	 * Método para obtención de atributo privado.
	 * 
	 * @return Numero de cuenta bancaria.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Método para manipulación de atributo privado.
	 * 
	 * @param accountNumber Numero de cuenta a manipular.
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}

