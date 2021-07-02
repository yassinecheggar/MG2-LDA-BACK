package com.mg2.lda.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mg2.lda.models.Activite;
import com.mg2.lda.models.Role;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.RoleRepository;

@RestController
@RequestMapping("Role")
@CrossOrigin("*")
public class RoleRestService {


	@Autowired
	RoleRepository repo;

	 @GetMapping("/GetAll")
		public List<Role> getAll(){
			return repo.findAll();
		}
	    
	 
	 
	 
		@PostMapping("/Add")
		public boolean add(@RequestBody Role role) {

			if(repo.save(role) != null) {
				return true;
			}
			return false;
		}

}
