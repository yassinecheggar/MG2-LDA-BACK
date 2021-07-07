package com.mg2.lda.controler;

import java.sql.Date;
import java.util.ArrayList;
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

import com.mg2.lda.models.Author;
import com.mg2.lda.models.BestPractice;
import com.mg2.lda.models.Comment;
import com.mg2.lda.models.Document;
import com.mg2.lda.models.Modif;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.BestPracticeRepository;
import com.mg2.lda.repository.DocumentRepository;
import com.mg2.lda.repository.FeedbackRepository;
import com.mg2.lda.repository.ModifRepository;
import com.mg2.lda.repository.QuestionRepository;

@RestController
@RequestMapping("Document")
@CrossOrigin("*")
public class DocumentRestService {


	@Autowired
	DocumentRepository repo;
	@Autowired
	ModifRepository Modifrepo;
	
	@Autowired
	FeedbackRepository Feedrepo;
	
	@Autowired
	BestPracticeRepository Bestfrepo;
	
	@Autowired
	QuestionRepository Questrepo;
	
	
	@GetMapping("/GetAll")
	public List<Document> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/GetCountDash")
	public List<Long> GetCount(){
		List<Long> dash = new ArrayList<Long>();
		dash.add(repo.count());
		dash.add(Bestfrepo.count());
		dash.add(Questrepo.count());
		dash.add(Feedrepo.count());
		return dash;
	}
	
	@GetMapping("/GetTrainning")
	public List<Document> getTrainning(){
		return repo.findTrainningDos();
	}
	
	@GetMapping("/GetNoneTrainning")
	public List<Document> getNoneTrainning(){
		return repo.findNoneTrainningDos();
	}


	@GetMapping("/GetLast")
	public List<Document> GetLast(){
		return repo.findlastAdded();
	}
	
	@GetMapping("/GetLastMode")
	public List<Document> GetLastMode(){
		List<Modif> mods =  Modifrepo.findlastMod();
		List<Document> docs =  new ArrayList<Document>();
		
			for (Modif mod : mods) {
				Document d = mod.getDocumentMod();
				Author r = new Author();
				r.setNom(mod.getUserMod().getNom());
				r.setPrenom(mod.getUserMod().getPrenom());
				d.setPubDate((Date) mod.getDateModification());
				d.setDocummentauthor(r);
				docs.add(d);
			}
	
		// to  doooooooooooooooooooooooooooooooooooooooooooooooooooooooo
		
		return docs;
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
