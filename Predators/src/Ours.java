
public class Ours extends Predateur implements OursAction {
      public int factAgressivite;
      public int puissance;
      public boolean hivernation;
	
      public Ours() {
		super();
	}

	  public Ours(int factAgressivite, int puissance, boolean hivernation) {
		super();
		this.factAgressivite = factAgressivite;
		this.puissance = puissance;
		this.hivernation = hivernation;
	}

	@Override
	public void afficheCaract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grimper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creuser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hiverner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hurler() {
		// TODO Auto-generated method stub
		
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

	public int getFactAgressivite() {
		return factAgressivite;
	}

	public void setFactAgressivite(int factAgressivite) {
		this.factAgressivite = factAgressivite;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public boolean isHivernation() {
		return hivernation;
	}

	public void setHivernation(boolean hivernation) {
		this.hivernation = hivernation;
	}
      
     
	  
   
}

