package metier;

import java.util.ArrayList;
import java.util.List;


public class Client {
	
	private String prenom;
	private String nom;
	private List<Achat> achats=new ArrayList();
	
	
	
	public Client(String prenom, String nom, List<Achat> achats) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.achats = achats;
	}
	
	public Client(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public List<Achat> getAchats() {
		return achats;
	}

	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}

	@Override
	public String toString() {
		return "Client [prenom=" + prenom + ", nom=" + nom + ", achats=" + achats + "]";
	}

}
