package sesame.poo.heritage_et_polymorphisme.ex2b;

/**
 * @author Ala GARBAA
 *
 *         
 */
public class EmployeHoraire extends Employe {

	final int DUE = 40;
	@SuppressWarnings("unused")
	private int taux_horaire;
	@SuppressWarnings("unused")
	private int nombre_heures;
	@SuppressWarnings("unused")
	private double tarif_horaire;

	EmployeHoraire(String nom, int taux_horaire, int nombre_heures, double tarif_horaire) {
		super(nom);
		setInfosSalaire(taux_horaire, nombre_heures, tarif_horaire);
	}

	EmployeHoraire(String nom) {
		super(nom);
	}

	public void setInfosSalaire(int taux_horaire, int nombre_heures, double tarif_horaire) {
		this.taux_horaire = taux_horaire;
		this.nombre_heures = nombre_heures;
		this.tarif_horaire = tarif_horaire;
	}

	public double getSalaire() {
		return (tarif_horaire + (nombre_heures - DUE) * (1 + taux_horaire / 100));
	}

}