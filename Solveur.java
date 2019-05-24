public class Solveur {

	private PlateauJeu j;

	public Solveur(PlateauJeu j){
		this.j = j;
	}
	
	public PlateauJeu resoudre(){
		PlateauJeu temp = null;
		int minError = j.nbErreur();
		int x = 3;

		while (minError > x){
			for(int i = 0; i < 9; i++){ //pour chaque carte
				//System.out.println("carte "+ i);
				for(int k = 0; k < 4; k++){ //pour chaque rotation
					j.rotationPiece(i);
					//System.out.println("	rotation "+ (k+1));
					if (j.nbErreur() < minError){
						minError = j.nbErreur();
						temp = j.clone();
						break ;
					}
				}
			}
			if (minError == x){
				System.out.println("Nombre d'erreurs minimal trouvé: "+minError+"\n");
				return temp;
			}
			j.echangeAlea();
		}

		System.out.println("Nombre d'erreurs minimal trouvé: "+minError+"\n");
		return temp;	
	}
}
