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
public class Question implements Serializable{

	@Id @GeneratedValue
	private  Integer   id;
	@Column(columnDefinition = "TEXT")
	private  String  decsiption;
	private  String  categorie;
	

	@ManyToOne
	@JoinColumn
	private User userQuest ; 
	 
	
	@ManyToOne
	@JoinColumn
	private Activite  activiteQuest ;
	
	@JsonIgnore
	@OneToMany(mappedBy="questionimage",fetch=FetchType.LAZY)
	private List<Picture> pictureList;
	
	@JsonIgnore
	@OneToMany(mappedBy="RepsonseQuestion",fetch=FetchType.LAZY)
	private List<Reponse> reponseList;
	
	private String ProblemType;
	private  Date date;
	
	private String phase;
	
	private String Status;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}


	
	


	public String getCategorie() {
		return categorie;
	}






	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}






	public List<Reponse> getReponseList() {
		return reponseList;
	}






	public void setReponseList(List<Reponse> reponseList) {
		this.reponseList = reponseList;
	}






	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDecsiption() {
		return decsiption;
	}


	public void setDecsiption(String decsiption) {
		this.decsiption = decsiption;
	}


	public User getUserQuest() {
		return userQuest;
	}


	public void setUserQuest(User userQuest) {
		this.userQuest = userQuest;
	}


	

	public Activite getActiviteQuest() {
		return activiteQuest;
	}


	public void setActiviteQuest(Activite activiteQuest) {
		this.activiteQuest = activiteQuest;
	}


	
	public String getProblemType() {
		return ProblemType;
	}


	public void setProblemType(String problemType) {
		ProblemType = problemType;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String getPhase() {
		return phase;
	}



	public void setPhase(String phase) {
		this.phase = phase;
	}




	public List<Picture> getPictureList() {
		return pictureList;
	}


	public void setPictureList(List<Picture> pictureList) {
		this.pictureList = pictureList;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}
	
	
	

}
