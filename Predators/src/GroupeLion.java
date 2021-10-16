
public class GroupeLion extends GroupePredateur implements GroupePredateurAction, GroupeLionAction {
	
	private Lion[] couple = new Lion[1];
	private int puissanceGroupe ;
	private Lion[] groupeLions ;
	
	

	public GroupeLion() {
		super();
	}
	
	

	public GroupeLion(Lion[] couple, int puissanceGroupe) {
		super();
		this.couple = couple;
		this.puissanceGroupe = puissanceGroupe;
	}



	@Override
	public void makeCouple() {
		

	}

	@Override
	public void makeReproduction() {
		

	}

	@Override
	public void declarerNon_dom() {
		

	}

	@Override
	public void affCaracteristiques() {
		

	}

	@Override
	public void addRemovePred() {
		

	}



	public Lion[] getCouple() {
		return couple;
	}



	public void setCouple(Lion[] couple) {
		this.couple = couple;
	}
	
	


	public Lion[] getGroupeLions() {
		return groupeLions;
	}



	public void setGroupeLions(Lion[] groupeLions) {
		this.groupeLions = groupeLions;
	}



	public int getPuissanceGroupe() {
		return puissanceGroupe;
	}



	public void setPuissanceGroupe(int puissanceGroupe) {
		this.puissanceGroupe = puissanceGroupe;
	}



	
	
	
	

}
