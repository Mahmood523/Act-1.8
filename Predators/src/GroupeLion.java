
public class GroupeLion extends GroupePredateur implements GroupePredateurAction, GroupeLionAction {
	
	private Lion[] couple = new Lion[1];
	private int puissanceGroupe ;
	private Lion[] groupeLions ;
	private boolean femelle ;
	private boolean maleDom ;
	private boolean coupleDom ;
	private String testFem = new String();
	private Lion.Domination testMale ;
	
	
	
	

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
	    testFem = Lion.getSexe (couple[0]);
	    testMale = Lion.getDomination(couple[1]);
	    
	    if	( testFem == "feminin" )
		
			femelle = true ;
		
		
		
		if ( testMale == Lion.Domination.dominant)
			maleDom =true;
				
		
		if ((femelle == true) && (maleDom == true))
           coupleDom = true ;
		else makeCouple();

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



	public boolean isFemelle() {
		return femelle;
	}



	public void setFemelle(boolean femelle) {
		this.femelle = femelle;
	}



	public boolean isMaleDom() {
		return maleDom;
	}



	public void setMaleDom(boolean maleDom) {
		this.maleDom = maleDom;
	}



	public boolean isCoupleDom() {
		return coupleDom;
	}



	public void setCoupleDom(boolean coupleDom) {
		this.coupleDom = coupleDom;
	}

    

	
	
	
	

}
