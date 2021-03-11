package sesame.poo.heritage_et_polymorphisme.ex1;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class CompteBancaire {

	// Ce solde peut être positif (compte créditeur) ou négatif (compte débiteur).
	protected double solde;

	// Chaque compte est caractérisé par un code incrémenté automatiquement.
	static int code;

	public CompteBancaire() {
		// A sa création, un compte bancaire a
		// un solde null
		setSolde(0.0);
		// un code incrémenté.
		incrementer();
	}

	// o Il est aussi possible de créer un compte en précisant son solde initial
	public CompteBancaire(double solde) {
		setSolde(solde);
		// un code incrémenté.
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
		String msgToOutput = "\nCompte N°: " + code + " \nVotre solde est : " + this.solde + "€\n\n";
		System.out.println(msgToOutput);
		return msgToOutput;
	}

	public void incrementer() {
		code++;
	}

}
