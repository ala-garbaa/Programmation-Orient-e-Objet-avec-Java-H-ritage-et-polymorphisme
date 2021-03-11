package sesame.poo.heritage_et_polymorphisme.ex2;

/**
 * @author Ala GARBAA
 *
 * 
 */
public class EmployeTarif50 extends Employe{

	public EmployeTarif50(String nom) {
		super(50, nom);
	}
	
	public EmployeTarif50(String nom, int nombre_heures, double prix_heure, double chiffre_affaire) {
		super(50, nom);
		setInfosSalaire(nombre_heures, prix_heure, chiffre_affaire);
	}

}
