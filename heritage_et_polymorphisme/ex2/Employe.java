package sesame.poo.heritage_et_polymorphisme.ex2;

/**
 * @author Ala GARBAA
 *
 * 
 */
public class Employe {

	static int CHARGE_HORAIRE = 40;
	protected int nombre_heures;
	protected double percentage;
	protected double chiffre_affaire;
	protected double prix_heure;
	private String nom;

	public Employe(double percentage, String nom) {
		this.percentage = percentage;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setInfosSalaire(int nombre_heures, double prix_heure, double chiffre_affaire) {
		this.nombre_heures = nombre_heures;
		this.chiffre_affaire = chiffre_affaire;
		this.prix_heure = prix_heure;
	}

	public double getSalaire() {
		double salaire_de_base = (double) (this.prix_heure * this.nombre_heures);
		int nombre_supplementaires = 0;

		if (this.nombre_heures > CHARGE_HORAIRE) {
			nombre_supplementaires = this.nombre_heures - CHARGE_HORAIRE;
		}

		return salaire_de_base + nombre_supplementaires * (this.prix_heure + (this.prix_heure * this.percentage) / 100);
	}

}
