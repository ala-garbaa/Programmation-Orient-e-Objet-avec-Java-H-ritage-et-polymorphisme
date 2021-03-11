package sesame.poo.heritage_et_polymorphisme.ex2;

/**
 * @author Ala GARBAA
 *
 * 
 */
public class EmployeTarif30 extends Employe {

	public EmployeTarif30(String nom) {
		super(30, nom);
	}

	public EmployeTarif30(String nom, int nombre_heures, double prix_heure, double chiffre_affaire) {
		super(30, nom);
		setInfosSalaire(nombre_heures, prix_heure, chiffre_affaire);
	}

}
