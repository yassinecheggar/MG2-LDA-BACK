package com.mg2.lda.controler;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mg2.lda.models.BestPractice;
import com.mg2.lda.models.Comment;
import com.mg2.lda.models.Document;
import com.mg2.lda.models.Modif;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.DocumentRepository;

@RestController
@RequestMapping("Document")
@CrossOrigin("*")
public class DocumentRestService {


	@Autowired
	DocumentRepository repo;
	
	
	@GetMapping("/GetAll")
	public List<Document> getAll(){
		return repo.findAll();
	}


	@GetMapping("/GetCommentBydoc/{id}")
	public List<Comment> getCommentBydoc(@PathVariable Integer id){
		Document doc = repo.findById(id).get();
		if(doc!=null) {
			List<Comment>comments =  doc.getCommentsList();
			comments.sort(Comparator.comparing(Comment::getDateComment).reversed()) ;
			return comments;
		}
		return null;
	}
	
	@GetMapping("/GetLastModBydoc/{id}")
	public  Modif GetLastModBydoc(@PathVariable Integer id){
		try {
			Document doc = repo.findById(id).get();
			if(doc!=null) {
				List<Modif>mods =  doc.getModification();
				mods.sort(Comparator.comparing(Modif::getDateModification).reversed()) ;
				return mods.get(0);
			}
		} catch (Exception e) {
			
		}
		
		return null;
	}

	@PostMapping("/Add")
	public boolean add(@RequestBody Document document) {

		if(repo.save(document) != null) {
			return true;
		}
		return false;
	}

	@PutMapping("/Update/{id}")
	public boolean Update(@RequestBody Document document ,@PathVariable Integer id) {

		document.setId(id);
		if(repo.save(document) != null) {
			return true;
		}
		return false;
	}
	

	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {

		repo.deleteById(id) ;


	}


}
