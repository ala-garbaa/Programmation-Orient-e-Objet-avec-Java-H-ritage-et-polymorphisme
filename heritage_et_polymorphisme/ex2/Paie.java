package sesame.poo.heritage_et_polymorphisme.ex2;

import java.text.DecimalFormat;

/**
 * @author Ala GARBAA
 *
 * 
 */
public class Paie {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		double PRIX_HEURES_EXEMPLE = 20.63;

		Employe employes[] = { new EmployeTarif30("Laurent"),
				new EmployeTarif30("Mario", 50, PRIX_HEURES_EXEMPLE, 63254.33),
				new EmployeTarif30("Luc", 60, PRIX_HEURES_EXEMPLE, 5649.31),
				new EmployeTarif50("Jean-Noel", 20, PRIX_HEURES_EXEMPLE, 362.95),
				new EmployeTarif50("Jean-Luc", 95, PRIX_HEURES_EXEMPLE, 7316.95),
				new Commercial("Maxi", 988, PRIX_HEURES_EXEMPLE, 99187.95),
				new Commercial("Liam", 597, PRIX_HEURES_EXEMPLE, 54917.95),
				new Commercial("Jhon", 2234, PRIX_HEURES_EXEMPLE, 22187.95),
				new Commercial("Rosa", 125, PRIX_HEURES_EXEMPLE, 2187.95) };

		employes[0].setInfosSalaire(84, PRIX_HEURES_EXEMPLE, 648.33);

		for (int i = 0; i < employes.length; i++) {
			System.out.print("\nLe salaire hebdomadaire de l'employe " + employes[i].getNom() + ", vaut "
					+ df2.format(employes[i].getSalaire())+ "DT\n\n");
		}

	}

}
