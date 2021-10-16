import java.io.InputStream;
import java.util.Scanner;

public class Lion extends Predateur implements LionAction {
	private Domination domination;
	private Rang rang;
	private int impetuosite;
	private int typeRugir;
	private Scanner scanner = new Scanner( System.in);
	
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
		super.setNourriture (Nourriture.viande);
	
	}

	@Override
	public void chasser() {
		
		super.setGroupeSolitaire (GroupeSolitaire.groupe);
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
		
		super.setSon (Son.rugit);
		
		switch (typeRugir)
		{
		case 1 :
			System.out.println("Veuillez saisir un nombre:");
			typeRugir = scanner.nextInt();
			
			if (typeRugir==1)
				System.out.println("Exprimer l’appartenance à un groupe");
			break;
		
		case 2 :
			System.out.println("Veuillez saisir un nombre:");
			typeRugir = scanner.nextInt();
			
			if (typeRugir==2)
				System.out.println("Exprimer la domination");
			break;
			
		case 3 :
			System.out.println("Veuillez saisir un nombre:");
			typeRugir = scanner.nextInt();
			
			if (typeRugir==3)
				System.out.println("Exprimer la soumission");
			break;
			
		case 4 :
			System.out.println("Veuillez saisir un nombre:");
			typeRugir = scanner.nextInt();
			
			if (typeRugir==4)
				System.out.println("Exprimer l’agressivite");
			break;
			
		}
		while (  typeRugir < 5 );
			
		
	}
	
	

	@Override
	public void afficheCaract() {
		
		
	}

	@Override
	public void rugir() {
		
		
	}

	@Override
	public void entendreSon() {
		
		
	}

	@Override
	public void seSeparer() {
		
		
		
		
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
