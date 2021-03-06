package com.mg2.lda.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class BestPractice implements Serializable{

	@Id @GeneratedValue
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	private String  phase ; 
	private String  categorie;
	private  Date date;
	
	@JsonIgnore
	@OneToMany(mappedBy="bestPracticeimage",fetch=FetchType.LAZY)
	private List<Picture> pictureList;
	
	@ManyToOne
	@JoinColumn
	private User userBestPractice ; 
	
	@ManyToOne
	@JoinColumn
	private Delivrable delivrableBest;
	
	
	@ManyToOne
	@JoinColumn
	private Activite  activiteBest ; 

	
	
	

	


public BestPractice() {
	// TODO Auto-generated constructor stub
}

	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getPhase() {
		return phase;
	}




	public void setPhase(String phase) {
		this.phase = phase;
	}




	public String getCategorie() {
		return categorie;
	}




	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public User getUserBestPractice() {
		return userBestPractice;
	}




	public void setUserBestPractice(User userBestPractice) {
		this.userBestPractice = userBestPractice;
	}




	public Delivrable getDelivrableBest() {
		return delivrableBest;
	}




	public void setDelivrableBest(Delivrable delivrableBest) {
		this.delivrableBest = delivrableBest;
	}




	public Activite getActiviteBest() {
		return activiteBest;
	}




	public void setActiviteBest(Activite activiteBest) {
		this.activiteBest = activiteBest;
	}

	public List<Picture> getPictureList() {
		return pictureList;
	}

	public void setPictureList(List<Picture> pictureList) {
		this.pictureList = pictureList;
	}

	@Override
	public String toString() {
		return "BestPractice [id=" + id + ", description=" + description + ", phase=" + phase + ", categorie="
				+ categorie + ", date=" + date + ", pictureList=" + pictureList + ", userBestPractice="
				+ userBestPractice + ", delivrableBest=" + delivrableBest + ", activiteBest=" + activiteBest + "]";
	}





	
	
	




	
}
