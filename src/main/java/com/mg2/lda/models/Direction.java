package com.mg2.lda.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Direction implements Serializable{

	@Id @GeneratedValue
	private  Integer id;
	
	@Column(columnDefinition = "TEXT")
	private  String  directiondesc;
	
	

	@JsonIgnore
	@OneToMany(mappedBy="documentdirection",fetch=FetchType.LAZY)
	private List<Document> documentsList;
	
	
	public Direction() {
		
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}






	public String getDirectiondesc() {
		return directiondesc;
	}




	public void setDirectiondesc(String directiondesc) {
		this.directiondesc = directiondesc;
	}




	public List<Document> getDocumentsList() {
		return documentsList;
	}




	public void setDocumentsList(List<Document> documentsList) {
		this.documentsList = documentsList;
	}




	@Override
	public String toString() {
		return "Direction [id=" + id + ", directiondesc=" + directiondesc + ", documentsList=" + documentsList + "]";
	}

	
	
	
	
}
