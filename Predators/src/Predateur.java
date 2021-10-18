
public abstract class Predateur implements PredateurAction {
	private static String sexe ;
	private CategorieAge categorieAge;
	private int force;
	private GroupeSolitaire groupeSolitaire;
	private Nourriture nourriture;
	private Son son ;
	
	
	enum GroupeSolitaire {groupe ,solitaire };
	enum Nourriture {viande,omnivore};
	enum CategorieAge {jeune , adulte, vieux };	
	enum Son {rugit,hurle}
	
	

	public Predateur() {
		
	}

	
	public Predateur(String sexe, Predateur.CategorieAge categorieAge, int force,
			Predateur.GroupeSolitaire groupeSolitaire) {
		Predateur.sexe = sexe;
		this.categorieAge = categorieAge;
		this.force = force;
		this.groupeSolitaire = groupeSolitaire;
	}


	
	public void seNourrir() {
		// TODO Auto-generated method stub
		
	}

	
	public void chasser() {
		// TODO Auto-generated method stub
		
	}

	
	public void courir() {
		// TODO Auto-generated method stub
		
	}

	
	public void seReproduire() {
		// TODO Auto-generated method stub
		
	}

	
	public void emettreSon() {
		// TODO Auto-generated method stub
		
	}


	public static String getSexe(Lion l1) {
		return sexe;
	}


	public void setSexe(String sexe) {
		Predateur.sexe = sexe;
	}


	public CategorieAge getCategorieAge() {
		return categorieAge;
	}


	public void setCategorieAge(CategorieAge categorieAge) {
		this.categorieAge = categorieAge;
	}


	public int getForce() {
		return force;
	}


	public void setForce(int force) {
		this.force = force;
	}


	public GroupeSolitaire getGroupeSolitaire() {
		return groupeSolitaire;
	}


	public void setGroupeSolitaire(GroupeSolitaire groupeSolitaire) {
		this.groupeSolitaire = groupeSolitaire;
	}


	public Nourriture getNourriture() {
		return nourriture;
	}


	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}


	public Son getSon() {
		return son;
	}


	public void setSon(Son son) {
		this.son = son;
	};
	
	
	
	
	

	
	
}
