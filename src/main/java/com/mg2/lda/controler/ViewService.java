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
import com.mg2.lda.models.View;
import com.mg2.lda.repository.ViewRepository;

@RestController
@RequestMapping("View")
@CrossOrigin("*")
public class ViewService {

	@Autowired
	ViewRepository repo;

	@GetMapping("/GetAll")
	public List<View> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/getDocumentTypeCount")
	public List<?> getDocumentTypeCount(){
	
		System.out.println(repo.getDocumentTypeCount());
		return repo.getDocumentTypeCount();
	}

	
	@GetMapping("/GetUsersVisits")
	public List<?> GetUsersVisits(){
	
		return repo.GetUsersVisits();
	}
	
	@GetMapping("/getDocumentCountByType")
	public List<?> getDocumentCountByType(){
	
		
		return repo.getDocumentCountByType();
	}


	@PostMapping("/Add")
	public boolean add(@RequestBody View view) {

		if(repo.save(view) != null) {
			return true;
		}
		return false;
	}

	@PutMapping("/Update/{id}")
	public boolean Update(@RequestBody View view,@PathVariable Integer id) {

		view.setId(id);
		if(repo.save(view) != null) {
			return true;
		}
		return false;
	}

	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {
		repo.deleteById(id) ;

	}

}
