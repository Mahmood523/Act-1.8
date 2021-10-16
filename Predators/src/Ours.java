import java.util.Scanner;

public class Ours extends Predateur implements OursAction {
	private int factAgressivite;
	private int puissance;
	private boolean hivernation;
	private int typeHurler;
	private Scanner scanner = new Scanner( System.in);
	
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
		
		
	}

	@Override
	public void grimper() {
		
		
	}

	@Override
	public void creuser() {
		
		
	}

	@Override
	public void hiverner() {
		
		
	}

	@Override
	public void hurler() {
		
		
	}

	@Override
	public void seNourrir() {
		
		super.setNourriture (Nourriture.omnivore);
	}

	@Override
	public void chasser() {
		
		super.setGroupeSolitaire (GroupeSolitaire.solitaire);
	}

	@Override
	public void courir() {
		
		super.courir();
	}

	@Override
	public void seReproduire() {
		
		super.seReproduire();
	}

	@Override
	public void emettreSon() {
		
		super.setSon (Son.hurle);
		
		switch (typeHurler)
		{
		case 1 :
			System.out.println("Veuillez saisir un nombre:");
			typeHurler = scanner.nextInt();
			
			if (typeHurler==1)
				System.out.println("Exprimer la peur");
			break;
		
		case 2 :
			System.out.println("Veuillez saisir un nombre:");
			typeHurler = scanner.nextInt();
			
			if (typeHurler==2)
				System.out.println("Exprimer sa presence");
			break;
			
		case 3 :
			System.out.println("Veuillez saisir un nombre:");
			typeHurler = scanner.nextInt();
			
			if (typeHurler==3)
				System.out.println("Effrayer un autre predateur");
			break;
			
		case 4 :
			System.out.println("Veuillez saisir un nombre:");
			typeHurler = scanner.nextInt();
			
			if (typeHurler==4)
				System.out.println("Exprimer l’agressivite");
			break;
			
		}
		while ( typeHurler < 5);
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

