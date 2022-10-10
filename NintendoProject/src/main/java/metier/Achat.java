package metier;

public class Achat {
	
	private Jeu jeu;
	private String date;
	private int prix;
	
	public Achat(Jeu jeu, String date, int prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	
	
	

}
