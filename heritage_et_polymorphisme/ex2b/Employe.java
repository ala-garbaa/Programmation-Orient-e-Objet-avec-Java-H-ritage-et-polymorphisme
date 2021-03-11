package sesame.poo.heritage_et_polymorphisme.ex2b;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class Employe {

	protected String nom;

	Employe(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public double getSalaire() {
		return -1;
	}

}
