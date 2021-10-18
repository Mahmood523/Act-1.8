
public class Main {

	public static void main(String[] args) {
		Lion L1 = new Lion("masculin",Predateur.CategorieAge.jeune, 5 , Predateur.GroupeSolitaire.groupe,Lion.Domination.dominant,Lion.Rang.ALPHA,5);
		Lion l2 = new Lion("masculin",Predateur.CategorieAge.adulte, 5 , Predateur.GroupeSolitaire.groupe,Lion.Domination.nonDominant,Lion.Rang.ALPHA,5);
		Lion l3 = new Lion("feminin",Predateur.CategorieAge.jeune, 5 , Predateur.GroupeSolitaire.groupe,Lion.Domination.dominant,Lion.Rang.ALPHA,5);

		Lion[] couple = new Lion[2];
		couple[0] = L1;
		couple[1] = l2;
		
		Lion[] couple1 = new Lion[2];
		couple1[0] = L1;
		couple[1] = l3;
		
		Lion[] couple2 = new Lion[2];
		couple2[0] = l2;
		couple2[1] = l3;
		
		
		
		
		GroupeLion groupeLion = new GroupeLion();
		groupeLion.makeCouple(couple);
		GroupeLion groupeLion2 = new GroupeLion();
		groupeLion2.makeCouple(couple1);
		GroupeLion groupeLion3 = new GroupeLion();
		groupeLion3.makeCouple(couple2);
		
		
		
		
	}

}
