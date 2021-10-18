
public class GroupePredateur implements GroupePredateurAction {
	private int tailleGroupe ;
	private String zone ;
	
	public GroupePredateur() {
		
	}

	public GroupePredateur(int tailleGroupe, String zone) {
		
		this.tailleGroupe = tailleGroupe;
		this.zone = zone;
	}

	@Override
	public void affCaracteristiques() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRemovePred() {
		// TODO Auto-generated method stub
		
	}

	public int getTailleGroupe() {
		return tailleGroupe;
	}

	public void setTailleGroupe(int tailleGroupe) {
		this.tailleGroupe = tailleGroupe;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	
	
	
	
	
	

}
