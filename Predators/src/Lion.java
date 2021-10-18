
import java.util.Scanner;

public class Lion extends Predateur implements LionAction {
	private static Domination domination;
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
		Lion.domination = domination;
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

	public static  Domination getDomination(Lion l1) {
		return domination;
	}

	public void setDomination(Domination domination) {
		Lion.domination = domination;
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
	}

	
	public static String getSexe(Lion l1) {
		
		return getSexe(l1);
	}

	@Override
	public void setSexe(String sexe) {
		// TODO Auto-generated method stub
		super.setSexe(sexe);
	}

	@Override
	public Predateur.CategorieAge getCategorieAge() {
		// TODO Auto-generated method stub
		return super.getCategorieAge();
	}

	@Override
	public void setCategorieAge(Predateur.CategorieAge categorieAge) {
		// TODO Auto-generated method stub
		super.setCategorieAge(categorieAge);
	}

	@Override
	public int getForce() {
		// TODO Auto-generated method stub
		return super.getForce();
	}

	@Override
	public void setForce(int force) {
		// TODO Auto-generated method stub
		super.setForce(force);
	}

	@Override
	public Predateur.GroupeSolitaire getGroupeSolitaire() {
		// TODO Auto-generated method stub
		return super.getGroupeSolitaire();
	}

	@Override
	public void setGroupeSolitaire(Predateur.GroupeSolitaire groupeSolitaire) {
		// TODO Auto-generated method stub
		super.setGroupeSolitaire(groupeSolitaire);
	}

	@Override
	public Predateur.Nourriture getNourriture() {
		// TODO Auto-generated method stub
		return super.getNourriture();
	}

	@Override
	public void setNourriture(Predateur.Nourriture nourriture) {
		// TODO Auto-generated method stub
		super.setNourriture(nourriture);
	}

	@Override
	public Predateur.Son getSon() {
		// TODO Auto-generated method stub
		return super.getSon();
	}

	@Override
	public void setSon(Predateur.Son son) {
		// TODO Auto-generated method stub
		super.setSon(son);
	};
	
	
	

}
