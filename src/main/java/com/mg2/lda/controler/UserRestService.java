package com.mg2.lda.controler;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mg2.lda.models.Activite;
import com.mg2.lda.models.Role;
import com.mg2.lda.models.User;
import com.mg2.lda.repository.ActiviteRepository;
import com.mg2.lda.repository.RoleRepository;
import com.mg2.lda.repository.UserRepository;

@RestController
@RequestMapping("User")
@CrossOrigin("*")
public class UserRestService {

	
	@Autowired
	UserRepository repo;
	
	@Autowired
	RoleRepository repoR;
	 
	 @GetMapping("/GetAll")
		public List<User> getAllBesoinPC(){
			return repo.findAll();
		}

	 
	 @GetMapping("/GetById/{id}")
		public User GetById(@PathVariable Integer id){
			return repo.findById(id).get();
		}

	 
	 
	 @GetMapping("/GetRole/{name}")
		public List<String> GetById(@PathVariable String name){
			return repo.findRole(name);
		}

	 
	 @GetMapping("/GetUsersByPrev")
		public List<User> getUserByPrev(){
			return repo.findAllByPrevilege("admin");
		}
	 
	 @PostMapping("/GetUsersByName")
		public User GetUsersByName(@RequestBody User user ){
		 
		 	System.out.println(user.getUsername());
			return repo.findByuserName(user.getUsername());
		}
	 
	 


		@PostMapping("/Add")
		public boolean addActivite(@RequestBody User user) {
			Set<Role> roles = new HashSet<Role>();
			
			String s  =  user.getPassword();
			 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		     user.setPassword(passwordEncoder.encode(s)) ;
		    
		    
		     if(user.getRoles().size()>0) {
					for (Role role : user.getRoles()) {
						roles.add(repoR.getById(role.getId()));
					}
					user.setRoles(new HashSet<Role>());
					User res =  repo.save(user);
					res.setRoles(roles);
					res.setEnabled(true);
					repo.save(user);
				}
			
			return true;
		}

		@PutMapping("/Update/{id}")
		public boolean addBesoinPC(@RequestBody User user,@PathVariable Integer id) {
			Set<Role> roles = new HashSet<Role>();
			
			User u  =  repo.findById(id).get();
			if(user.getRoles().size()>0) {
				for (Role role : user.getRoles()) {
					roles.add(repoR.getById(role.getId()));
				}
			}
			String s  =  user.getPassword();
			if(user.getPassword()!=null) {
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		    user.setPassword(passwordEncoder.encode(s)) ;
		    user.setPassword(u.getPassword());
			}else {
				user.setPassword(u.getPassword());
			}
			
		     user.setId(id);
		 
		     user.setRoles(roles);
			if(repo.save(user) != null) {
				return true;
			}
			return false;
		}
		
		@PutMapping("/UpdatePwd/{id}")
		public User updatePwd(@RequestBody User user,@PathVariable Integer id) {
			if(!user.getPassword().equals("")) {
				
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				User  u = repo.findById(id).get();
				System.out.println(user);
				u.setPassword(passwordEncoder.encode(user.getPassword()));
				return repo.save(u);
			}
			
			
			return null;
		}

		@DeleteMapping("/Delete/{id}")
		public void delete(@PathVariable Integer id) {

			repo.deleteById(id) ;


		}
		
		 
		 @GetMapping("/Chek")
			public String  check(){
				return "ok";
			}
		 
}
