package sesame.poo.heritage_et_polymorphisme.ex2;

/**
 * @author Ala GARBAA
 *
 * 
 */
public class Commercial extends Employe {

	public Commercial(String nom) {
		super(1, nom);
	}

	public Commercial(String nom, int nombre_heures, double prix_heure, double chiffre_affaire) {
		super(1, nom);
		setInfosSalaire(nombre_heures, prix_heure, chiffre_affaire);
	}

	public double getSalaire() {
		double salaire_de_base = (double) (this.prix_heure * this.nombre_heures);
		return salaire_de_base + ((this.chiffre_affaire * this.percentage) / 100);
	}

}
