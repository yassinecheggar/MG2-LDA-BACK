package com.mg2.lda.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Picture implements Serializable{

	@Id @GeneratedValue
	private  Integer  id;
	
	@Column(columnDefinition = "TEXT")
	private String   link;
	private String description;
	
	
	@ManyToOne
	@JoinColumn
	private  BestPractice bestPracticeimage;

	@ManyToOne
	@JoinColumn
	private Question questionimage;
	

	@ManyToOne
	@JoinColumn
	private  Feedback feedbackImage;
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}




	public Feedback getFeedbackImage() {
		return feedbackImage;
	}



	public void setFeedbackImage(Feedback feedbackImage) {
		this.feedbackImage = feedbackImage;
	}


	public Picture() {
		// TODO Auto-generated constructor stub
	}

	public BestPractice getBestPracticeimage() {
		return bestPracticeimage;
	}



	public void setBestPracticeimage(BestPractice bestPracticeimage) {
		this.bestPracticeimage = bestPracticeimage;
	}



	public Question getQuestionimage() {
		return questionimage;
	}



	public void setQuestionimage(Question questionimage) {
		this.questionimage = questionimage;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Picture [id=" + id + ", link=" + link + ", description=" + description + ", bestPracticeimage="
				+ bestPracticeimage + ", questionimage=" + questionimage + ", feedbackImage=" + feedbackImage + "]";
	}



	


	
	
}
