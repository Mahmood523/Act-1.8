
public class GroupeLion extends GroupePredateur implements GroupePredateurAction, GroupeLionAction {
	
	private static Lion[] couple = new Lion[2];
	private int puissanceGroupe ;
	private Lion[] groupeLions ;
	private static boolean femelle =false ;
	private static boolean maleDom= false ;
	private static String testFem = new String();
	private static Lion.Domination testMale ;
	
	
	
	

	public GroupeLion() {
		super();
	}
	
	

	public GroupeLion(Lion[] couple, int puissanceGroupe) {
		super();
		GroupeLion.couple = couple;
		this.puissanceGroupe = puissanceGroupe;
	}



	@Override
	public void makeCouple( Lion[] couple) {
	    testFem = Lion.getSexe (couple[0]);
	    testMale = Lion.getDomination(couple[1]);
	    
	    
	    if	( testFem == "feminin" )
		      femelle = true ;
		
		
		
		if ( testMale == Lion.Domination.dominant)
			 maleDom =true;
				
		
		if ((femelle == true) && (maleDom == true))
           
		     System.out.println("Couple Dominant");
		else 
			 System.out.println("Couple NonDominant");

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



	public static Lion[] getCouple() {
		return couple;
	}



	public void setCouple(Lion[] couple) {
		GroupeLion.couple = couple;
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
		GroupeLion.femelle = femelle;
	}



	public boolean isMaleDom() {
		return maleDom;
	}



	public void setMaleDom(boolean maleDom) {
		GroupeLion.maleDom = maleDom;
	}



	

    

	
	
	
	

}
