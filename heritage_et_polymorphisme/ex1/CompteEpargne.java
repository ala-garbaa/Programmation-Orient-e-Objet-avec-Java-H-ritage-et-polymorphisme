package sesame.poo.heritage_et_polymorphisme.ex1;

/**
 * @author Ala GARBAA
 *
 */
public class CompteEpargne extends CompteBancaire {

	private int tauxInteret;

	public CompteEpargne() {
		setTauxInteret(4);
	}

	public CompteEpargne(double solde) {
		super(solde);
	}

	public int getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(int tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public void calculInteret() {
		this.solde -= ((this.tauxInteret * this.solde) / 100);
	}

}
