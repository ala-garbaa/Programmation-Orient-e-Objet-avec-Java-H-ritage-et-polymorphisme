package sesame.poo.heritage_et_polymorphisme.ex3_abstract;

/**
 * @author Ala GARBAA
 */
public class Commercial extends Employe {

	private double somme_fixe;
	private double chiffre_affaire;

	Commercial(String nom) {
		super(nom);
	}

	Commercial(String nom, double chiffre_affaire, double somme_fixe) {
		super(nom);
		this.chiffre_affaire = chiffre_affaire;
		this.somme_fixe = somme_fixe;
	}

	public void setInfosSalaire(double chiffre_affaire, double somme_fixe) {
		this.chiffre_affaire = chiffre_affaire;
		this.somme_fixe = somme_fixe;
	}

	public void setChiffreAffaire(double chiffre_affaire) {
		this.chiffre_affaire = chiffre_affaire;
	}

	public void setSommeFix(double somme_fixe) {
		this.somme_fixe = somme_fixe;
	}

	@Override
	public double getSalaire() {
		return (somme_fixe + (chiffre_affaire * (1 + (1.0 / 100))));
	}

}