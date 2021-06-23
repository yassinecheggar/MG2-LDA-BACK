package com.mg2.lda.controler;

import java.sql.Date;
import java.text.SimpleDateFormat;

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

import com.mg2.lda.models.Activite;
import com.mg2.lda.models.Delivrable;
import com.mg2.lda.models.Feedback;
import com.mg2.lda.models.Reponse;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.FeedbackRepository;

@RestController
@RequestMapping("Feedback")
@CrossOrigin("*")
public class FeedbackRestService {

	

	@Autowired
	FeedbackRepository repo;
	
	@GetMapping("/GetAll")
	public List<Feedback> getAll(){
		return repo.findAll();
	}
	
	
	 @GetMapping("/GetReponse/{id}")
		public List<Reponse> getAllAnswers(@PathVariable Integer id){
			return repo.findById(id).get().getReponseList();
		}

	 
	 @GetMapping("/ValidatFeed/{id}")
		public Feedback Validation(@PathVariable Integer id){
		 
		
		 Feedback F = repo.findById(id).get();
		 if(F!=null) {
			 F.setValidationDate( new Date(System.currentTimeMillis()));
				return repo.save(F) ;
		 }
		
		 return  null;
		}



	@PostMapping("/Add")
	public Feedback add(@RequestBody Feedback feedback) {

		try {
			return repo.save(feedback);
		}catch (Exception e) {
			return null;
		}
	}

	@PutMapping("/Update/{id}")
	public boolean Update(@RequestBody Feedback feedback ,@PathVariable Integer id) {

		feedback.setId(id);
		if(repo.save(feedback) != null) {
			return true;
		}
		return false;
	}
	
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {

		repo.deleteById(id) ;


	}
	
}
