package sesame.poo.heritage_et_polymorphisme.ex1;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class ComptePayant extends CompteBancaire {

	public ComptePayant(double solde) {
		super(solde);
	}

	@Override
	public void useDepot(double montant) {
		this.solde += (montant - 5);
	}

	@Override
	public void useRetrait(double montant) {
		this.solde -= (montant + 5);
	}

}
