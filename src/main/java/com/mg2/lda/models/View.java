package com.mg2.lda.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class View implements Serializable{

	@Id @GeneratedValue
	private Integer id; 
	@Temporal(TemporalType.DATE)
	private Date date ; 
	private  String visited;
	private  Integer visitedid;
	
	@ManyToOne
	@JoinColumn
	private  User userVisit;
	
	
	
	
	
	public Integer getVisitedid() {
		return visitedid;
	}





	public void setVisitedid(Integer visitedid) {
		this.visitedid = visitedid;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	


	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public String getVisited() {
		return visited;
	}





	public void setVisited(String visited) {
		this.visited = visited;
	}





	public User getUserVisit() {
		return userVisit;
	}





	public void setUserVisit(User userVisit) {
		this.userVisit = userVisit;
	}





	public View() {
		// TODO Auto-generated constructor stub
	}

}
