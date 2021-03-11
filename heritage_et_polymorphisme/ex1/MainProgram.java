
package sesame.poo.heritage_et_polymorphisme.ex1;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class MainProgram {

	public static void main(String[] args) {

		// ---------------- 1 ---------------------------------------------------------
		// Créer une instance de la classe
		// CompteBancaire
		CompteBancaire cb = new CompteBancaire();
		cb.toString();
		cb.useDepot(10);
		cb.useRetrait(5);
		cb.toString();
		System.out.println("-----------------------------------------------------");

		// CompteEpargne
		CompteEpargne ce = new CompteEpargne();
		ce.toString();
		ce.useDepot(20);
		ce.useRetrait(10);
		ce.calculInteret();
		ce.toString();
		System.out.println("-----------------------------------------------------");
		
		// ComptePayant
		ComptePayant cp = new ComptePayant(30);
		cp.toString();
		cp.useDepot(30);
		cp.toString();
		cp.useRetrait(15);
		cp.toString();
				

		// End.

	}

}
