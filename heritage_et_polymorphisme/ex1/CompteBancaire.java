package sesame.poo.heritage_et_polymorphisme.ex1;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class CompteBancaire {

	// Ce solde peut �tre positif (compte cr�diteur) ou n�gatif (compte d�biteur).
	protected double solde;

	// Chaque compte est caract�ris� par un code incr�ment� automatiquement.
	static int code;

	public CompteBancaire() {
		// A sa cr�ation, un compte bancaire a
		// un solde null
		setSolde(0.0);
		// un code incr�ment�.
		incrementer();
	}

	// o Il est aussi possible de cr�er un compte en pr�cisant son solde initial
	public CompteBancaire(double solde) {
		setSolde(solde);
		// un code incr�ment�.
		incrementer();
	}

	public void useDepot(double montant) {
		this.solde += montant;
	}

	public void useRetrait(double montant) {
		this.solde -= montant;
	}
	
	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String toString() {
		String msgToOutput = "\nCompte N�: " + code + " \nVotre solde est : " + this.solde + "�\n\n";
		System.out.println(msgToOutput);
		return msgToOutput;
	}

	public void incrementer() {
		code++;
	}

}
