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
import com.mg2.lda.models.Reponse;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.ReponseRepository;

@RestController
@RequestMapping("Reponse")
@CrossOrigin("*")
public class ReponseRestService {

	
	@Autowired
	ReponseRepository repo;
	
	
	@GetMapping("/GetAll")
	public List<Reponse> getAllBesoinPC(){
		return repo.findAll();
	}
    
    @GetMapping("/GetById/{id}")
   	public Reponse getById(@PathVariable Integer id){
   		return repo.findById(id).get();
   	}


	@PostMapping("/Add")
	public boolean addActivite(@RequestBody Reponse reponse) {

		if(repo.save(reponse) != null) {
			return true;
		}
		return false;
	}

	@PutMapping("/Update/{id}")
	public boolean addBesoinPC(@RequestBody Reponse reponse,@PathVariable Integer id) {

		reponse.setId(id);
		if(repo.save(reponse) != null) {
			return true;
		}
		return false;
	}

	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {

		repo.deleteById(id) ;


	}
	
}
