import java.util.ArrayList;
import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		/**
		 * Pruebas sobre objeto de entidad Fruta.
		 */
		Fruit f = new Fruit();
		f.colors = new ArrayList<>();
		System.out.println("Test Object Fruit > ");
		System.out.println("Methods getColors y setColor: ");
		f.setColor("verde");
		f.setColor("azul");
		f.setColor("amarillo");
		System.out.println(f.getColors());

		/**
		 * Pruebas sobre objeto de entidad Persona.
		 */

		Person p = new Person();
		System.out.println("Test Object Persona > ");
		System.out.println("Methods setName y getName: ");
		p.setName("Alberto");
		System.out.println(p.getName());

		/**
		 * Pruebas sobre objeto de entidad CuentaBancaria.
		 */
		AccountBank cb = new AccountBank();
		System.out.println("Test Object AccountBank > ");
		System.out.println("Methods setActivated y getActivated: ");
		cb.setActivated(true);
		System.out.println(cb.getActivated());
		
		/**
		 * Pruebas sobre objeto de entidad Banco.
		 */
		Bank b = new Bank();
		System.out.println("Test Object Bank > ");
		System.out.println("Methods getNit y setNit: ");
		b.setNit(123456);
		System.out.println(b.getNit());
		System.out.println("Methods getInternalCode y setInternalCode: ");
		b.setInternalCode("a138ww");
		System.out.println(b.getInternalCode());
		
		/**
		 * Pruebas sobre objeto de entidad Transaccion.
		 */
		Transaction t = new Transaction();
		System.out.println("Test Object Transaction > ");
		System.out.println("Methods getMovDate y setMovDate: ");
		Date date = new Date(System.currentTimeMillis());
		t.setMovDate(date);
		System.out.println(t.getMovDate());
		
		/**
		 * Pruebas sobre objeto de entidad Vegetal.
		 */
		Vegetable v = new Vegetable();
		System.out.println("Test Object Vegetable > ");
		System.out.println("Methods getTaste y setTaste: ");
		v.setTaste("Amargo");
		System.out.println(v.getTaste());
		System.out.println("Methods getName y setName: ");
		v.setName("Cebolla");
		System.out.println(v.getName());

	}
}
