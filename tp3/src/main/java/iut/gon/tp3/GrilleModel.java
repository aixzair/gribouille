package iut.gon.tp3;

public class GrilleModel {
	private byte taille_tab = 3;
	private String[][] cases = new String[this.taille_tab][this.taille_tab];
	
	public GrilleModel() {
		for (int lg = 0; lg < this.taille_tab; lg++) {
			for (int col = 0; col < this.taille_tab; col++) {
				this.cases[col][lg] = String.format("L%dC%d", lg, col);
			}
		}
	}
	
	public String getCase(int lg, int col) {
		return this.cases[col][lg];
	}
	
	public void setCase(int lg, int col, String texte) {
		this.cases[col][lg] = texte;
	}

}
