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
public class Feedback implements Serializable{
	
	@Id @GeneratedValue
	private  Integer id;
	
	@Column(columnDefinition = "TEXT")
	private  String  feedback;
	/*userFeedback , activiteFeed , delivrableFeed can  be  found in  QuestionFeed so  it's  duplicated i wouldn't use them but ......*/
	@ManyToOne
	@JoinColumn
	private User userFeedback ; 
 
	@ManyToOne
	@JoinColumn
	private Activite  activiteFeed ;
	
	
	@ManyToOne
	@JoinColumn
	private Delivrable delivrableFeed;
	
	
	
	
	
	@JsonIgnore
	@OneToMany(mappedBy="feedbackImage",fetch=FetchType.LAZY)
	private List<Picture> imagesList;
	
	@JsonIgnore
	@OneToMany(mappedBy="RepsonseFeedback",fetch=FetchType.LAZY)
	private List<Reponse> reponseList;
	
	private String ProblemType;
	private  Date date;
	private Date validationDate;
	private String phase;
	
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

	
	

	public List<Reponse> getReponseList() {
		return reponseList;
	}


	public void setReponseList(List<Reponse> reponseList) {
		this.reponseList = reponseList;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public User getUserFeedback() {
		return userFeedback;
	}


	public void setUserFeedback(User userFeedback) {
		this.userFeedback = userFeedback;
	}
	
	

	public Delivrable getDelivrableFeed() {
		return delivrableFeed;
	}


	public void setDelivrableFeed(Delivrable delivrableFeed) {
		this.delivrableFeed = delivrableFeed;
	}


	


	public void setQuestionFeed(Question questionFeed) {
		questionFeed = questionFeed;
	}


	public List<Picture> getImagesList() {
		return imagesList;
	}



	public void setImagesList(List<Picture> imagesList) {
		this.imagesList = imagesList;
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


	public Date getValidationDate() {
		return validationDate;
	}


	public void setValidationDate(Date validationDate) {
		this.validationDate = validationDate;
	}


	public String getPhase() {
		return phase;
	}


	public void setPhase(String phase) {
		this.phase = phase;
	}


	public Activite getActiviteFeed() {
		return activiteFeed;
	}


	public void setActiviteFeed(Activite activiteFeed) {
		this.activiteFeed = activiteFeed;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	
	
	

}
