package com.mg2.lda.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reponse  implements Serializable{
	@Id @GeneratedValue
	private  Integer   id;
	
	@Column(columnDefinition = "TEXT")
	private  String  reponse;
	private  Date  date;
	
	
	
	@ManyToOne
	@JoinColumn
	private Question RepsonseQuestion;
	
		

	@ManyToOne
	@JoinColumn
	private User userReponse ; 
	
	
	
	public Integer getId() {
		return id;
	}







	public User getUserReponse() {
		return userReponse;
	}







	public void setUserReponse(User userReponse) {
		this.userReponse = userReponse;
	}







	public void setId(Integer id) {
		this.id = id;
	}







	public String getReponse() {
		return reponse;
	}







	public void setReponse(String reponse) {
		this.reponse = reponse;
	}







	public Date getDate() {
		return date;
	}







	public void setDate(Date date) {
		this.date = date;
	}







	public Question getRepsonseQuestion() {
		return RepsonseQuestion;
	}







	public void setRepsonseQuestion(Question repsonseQuestion) {
		RepsonseQuestion = repsonseQuestion;
	}







	public Reponse() {
		// TODO Auto-generated constructor stub
	}

}
