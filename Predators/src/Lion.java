
public class Lion extends Predateur implements LionAction {
	public Domination domination;
	public Rang rang;
	public int impetuosite;
	
	
	enum Domination {dominant ,nonDominant };
	enum Rang {ALPHA,BETA,GAMA,OMEGA }
	
	public Lion() {
		super();
	}

	public Lion(Lion.Domination domination, Lion.Rang rang, int impetuosite) {
		super();
		this.domination = domination;
		this.rang = rang;
		this.impetuosite = impetuosite;
	}

	@Override
	public void seNourrir() {
		// TODO Auto-generated method stub
		super.seNourrir();
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
		super.chasser();
	}

	@Override
	public void courir() {
		// TODO Auto-generated method stub
		super.courir();
	}

	@Override
	public void seReproduire() {
		// TODO Auto-generated method stub
		super.seReproduire();
	}

	@Override
	public void emettreSon() {
		// TODO Auto-generated method stub
		super.emettreSon();
	}
	
	@Override
	public void afficheCaract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rugir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entendreSon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seSeparer() {
		// TODO Auto-generated method stub
		
		
		
	}

	public Domination getDomination() {
		return domination;
	}

	public void setDomination(Domination domination) {
		this.domination = domination;
	}

	public Rang getRang() {
		return rang;
	}

	public void setRang(Rang rang) {
		this.rang = rang;
	}

	public int getImpetuosite() {
		return impetuosite;
	}

	public void setImpetuosite(int impetuosite) {
		this.impetuosite = impetuosite;
	};
	
	
	

}
