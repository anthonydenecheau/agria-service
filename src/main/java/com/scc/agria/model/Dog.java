package com.scc.agria.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agria_chien")
public class Dog{

	@Id
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "sexe")
	private String sexe;
	
	@Column(name = "date_naissance")
	private String dateNaissance;

	@Column(name = "lof")
	private String lof;
	
	@Column(name = "tatouage")
	private String tatouage;

	@Column(name = "transpondeur")
	private String transpondeur;

	@Column(name = "race")
	private String race;

	@Column(name = "variete")
	private String variete;

	@Column(name = "couleur")
	private String couleur;
	
	@Column(name = "date_maj")
	private Timestamp timestamp;
  
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getNom() { return nom; }
	public void setNom(String nom) { this.nom = nom; }

	public String getSexe() { return sexe; }
	public void setSexe(String sexe) { this.sexe = sexe; }

	public String getDateNaissance() { return dateNaissance; }
	public void setDateNaissance(String dateNaissance) { this.dateNaissance = dateNaissance; }

	public String getLof() { return lof; }
	public void setLof(String lof) { this.lof = lof; }
  
	public String getTatouage() { return tatouage; }
	public void setTatouage(String tatouage) { this.tatouage = tatouage; }
  
	public String getTranspondeur() { return transpondeur; }
	public void setTranspondeur(String transpondeur) { this.transpondeur = transpondeur; }

	public String getRace() { return race; }
	public void setRace(String race) { this.race = race; }

	public String getVariete() { return variete; }
	public void setVariete(String variete) { this.variete = variete; }

	public String getCouleur() { return couleur; }
	public void setCouleur(String couleur) { this.couleur = couleur; }
	
	public Timestamp getTimestamp() { return timestamp; }
	public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

	public Dog withId(int id){ this.setId( id ); return this; }
	public Dog withNom(String Nom){ this.setNom(Nom); return this; }
	public Dog withSexe(String sexe){ this.setSexe(sexe); return this; }
	public Dog withDateNaissance(String dateNaissance){ this.setDateNaissance(dateNaissance); return this; }
	public Dog withLof(String lof){ this.setLof(lof); return this; }
	public Dog withTatouage(String tatouage){ this.setTatouage(tatouage); return this; }
	public Dog withTranspondeur(String transpondeur){ this.setTranspondeur(transpondeur); return this; }
	public Dog withRace(String race){ this.setRace(race); return this; }
	public Dog withVariete(String variete){ this.setVariete(variete); return this; }
	public Dog withCouleur(String couleur){ this.setCouleur(couleur); return this; }
	public Dog withTimestamp(Timestamp timestamp){ this.setTimestamp(timestamp); return this; }
	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", nom=" + nom + ", sexe=" + sexe + ", dateNaissance=" + dateNaissance + ", lof=" + lof
				+ ", tatouage=" + tatouage + ", transpondeur=" + transpondeur + ", race=" + race + ", variete="
				+ variete + ", couleur=" + couleur + ", timestamp=" + timestamp + "]";
	}

}
