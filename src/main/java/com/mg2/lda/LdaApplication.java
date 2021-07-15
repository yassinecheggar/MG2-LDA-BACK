package com.mg2.lda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.mg2.lda.models.Role;
import com.mg2.lda.models.User;
import com.mg2.lda.repository.RoleRepository;
import com.mg2.lda.repository.UserRepository;
import com.mg2.lda.storage.FileStorageProperties;


@EnableConfigurationProperties({ FileStorageProperties.class})
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LdaApplication {

	@Autowired
	UserRepository repo;
	
	@Autowired
	RoleRepository repoRole;
	
	public static void main(String[] args) {
		SpringApplication.run(LdaApplication.class, args);
	}
	
	@Bean
	public void  Init() {
		if(repoRole.findAll().size()==0) {
			Role R1 = new Role(); 
			Role R2 = new Role(); 
			R1.setName("admin");
			R1.setName("user");
			repoRole.save(R1);
			repoRole.save(R2);
		}
		
		
		User u = repo.findByuserName("admin");
		
		if(u==null) {
			
			User admin =  new User();
			admin.setNom("admin");
			admin.setPrenom("admin");
			admin.setUsername("admin");
			admin.setEnabled(true);
			admin.setPassword("$2y$12$dZyYZyL2zay4BWpgBrt27OsIqYdYiwse1IaezCJvwLFeg3D49XM72");
			User res =  repo.save(admin);
			res.setRoles(repoRole.findByRoleName("admin"));
			
			repo.save(res);
			System.err.println(repoRole.findByRoleName("admin"));
		}
	}

}
