package com.mg2.lda.controler;

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
import com.mg2.lda.models.BestPractice;
import com.mg2.lda.models.Picture;
import com.mg2.lda.models.Question;
import com.mg2.lda.models.Reponse;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.QuestionRepository;

@RestController
@RequestMapping("Question")
@CrossOrigin("*")
public class QuestionRestService {

	
	

	@Autowired
	QuestionRepository repo;
	
	
	 @GetMapping("/GetAll")
		public List<Question> getAll(){
			return repo.findAll();
		}
	 
	 @GetMapping("/getNoneAnswerd")
		public List<Question> getNoneAnswerd(){
			return repo.getNoneAnswerd();
		}

	 @GetMapping("/GetResources/{id}")
		public List<Picture> GetResources(@PathVariable  Integer id){
			try {
				Question  quest =  repo.findById(id).get();
				if(quest!=null) {
						return quest.getPictureList();
						}
			} catch (Exception e) {
				return null;
			}
			
			return null;
		}
		
	 @GetMapping("/GetReponse/{id}")
		public List<Reponse> getAllAnswers(@PathVariable Integer id){
			return repo.findById(id).get().getReponseList();
		}


		@PostMapping("/Add")
		public Question add(@RequestBody Question question) {

			try {
				return repo.save(question);
			}catch (Exception e) {
				return null;
			}
		}

		@PutMapping("/Update/{id}")
		public boolean Update(@RequestBody Question question,@PathVariable Integer id) {

			question.setId(id);
			if(repo.save(question) != null) {
				return true;
			}
			return false;
		}
		
		@GetMapping("/SetStatus/{id}")
		public boolean SetStatus(@PathVariable Integer id) {

			Question q = repo.findById(id).get();
			if(q != null) {
				q.setStatus("resolue");
				repo.save(q);
				return true;
			}
			return false;
		}

		@DeleteMapping("/Delete/{id}")
		public void delete(@PathVariable Integer id) {

			repo.deleteById(id) ;


		}

}
