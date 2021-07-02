package com.mg2.lda.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable{

	@Id @GeneratedValue
	
	private  Integer id;
	private  String  nom; 
	private  String  prenom ; 
	private  String  username;
	
		
	private  String  password;

	private boolean enabled;
	
	 
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<Role> roles = new HashSet<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="userFeedback",fetch=FetchType.LAZY)
	private  List<Feedback>feedbackslist;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="userBestPractice",fetch=FetchType.LAZY)
	private  List<BestPractice> bestPracticesList;
	
	@JsonIgnore
	@OneToMany(mappedBy="userQuest",fetch=FetchType.LAZY)
	private  List<Question> questionsList;
	
	@JsonIgnore
	@OneToMany(mappedBy="RepsonseQuestion",fetch=FetchType.LAZY)
	private  List<Reponse> reponseList;
	
	
	
	 @JsonIgnore
	@OneToMany(mappedBy="userComment",fetch=FetchType.LAZY)
	private  List<Comment> commentsList;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="userMod",fetch=FetchType.LAZY)
	private List<Modif> modificationsList;
	
	

	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	

	public boolean isEnabled() {
		return enabled;
	}




	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}







	public Set<Role> getRoles() {
		return roles;
	}




	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	
	public List<BestPractice> getBestPracticesList() {
		return bestPracticesList;
	}


	public void setBestPracticesList(List<BestPractice> bestPracticesList) {
		this.bestPracticesList = bestPracticesList;
	}


	public List<Feedback> getFeedbackslist() {
		return feedbackslist;
	}


	public void setFeedbackslist(List<Feedback> feedbackslist) {
		this.feedbackslist = feedbackslist;
	}


	public List<Question> getQuestionsList() {
		return questionsList;
	}


	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}



	public List<Comment> getCommentsList() {
		return commentsList;
	}


	public void setCommentsList(List<Comment> commentsList) {
		this.commentsList = commentsList;
	}


	public List<Modif> getModificationsList() {
		return modificationsList;
	}


	public void setModificationsList(List<Modif> modificationsList) {
		this.modificationsList = modificationsList;
	}



	public List<Reponse> getReponseList() {
		return reponseList;
	}


	public void setReponseList(List<Reponse> reponseList) {
		this.reponseList = reponseList;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username + ", password="
				+ password + ", enabled=" + enabled + ", roles=" + roles + ", feedbackslist=" + feedbackslist
				+ ", bestPracticesList=" + bestPracticesList + ", questionsList=" + questionsList + ", reponseList="
				+ reponseList + ", commentsList=" + commentsList + ", modificationsList=" + modificationsList + "]";
	}




	
	

}
	