package sesame.poo.heritage_et_polymorphisme.ex2b;

import java.text.DecimalFormat;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class Paie {

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		Employe employes[] = { new EmployeHoraire("Laurent"), new EmployeHoraire("Luc", 30, 44, 700),
				new EmployeHoraire("Diva", 50, 54, 980), new Commercial("Jean-lionel", 1258.65, 854) };

		((EmployeHoraire) employes[0]).setInfosSalaire(50, 64, 1040);

		for (int i = 0; i < employes.length; i++) {
			System.out.print("\nLe salaire hebdomadaire de l'employe " + employes[i].getNom() + ", vaut "
					+ df2.format(employes[i].getSalaire()) + "DT\n\n");
		}

	}

}
