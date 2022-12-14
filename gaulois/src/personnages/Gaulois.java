package personnages;

public class Gaulois {
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "? " + texte + "?");
		
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : " ;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 );
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast?rix", 8);
//		Romain romulus = new Romain("Romulus",6);
		System.out.println(asterix.toString());
//		asterix.parler("Bonjour");
//		asterix.frapper(romulus);
	}
	}
	
