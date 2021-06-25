package com.mg2.lda.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
 
@Configuration
@EnableWebSecurity

public class BasicConfiguration extends WebSecurityConfigurerAdapter
{
	
	@Autowired
	DataSource dataSource;
	
	 
	    
    @Override
    protected void configure(HttpSecurity http) throws Exception 
    {
    
    	http
    	.cors().and()
        .authorizeRequests()
        .antMatchers("/**/Delete/*").hasRole("ADMIN")
        .anyRequest().authenticated()
        .and()
        .httpBasic()
        .and().csrf().disable()
      ;
    	
    }    
  
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
    	PasswordEncoder encoder = 
    	          PasswordEncoderFactories.createDelegatingPasswordEncoder();
    	  /*  	auth
    	          .inMemoryAuthentication()
    	          .withUser("user")
    	          .password(encoder.encode("password"))
    	          .roles("USER")
    	          .and()
    	          .withUser("admin")
    	          .password(encoder.encode("admin"))
    	          .roles("USER", "ADMIN");*/
    	 auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
    	.dataSource(dataSource).usersByUsernameQuery("select username , password , enabled from lda.user where username=?")
				.authoritiesByUsernameQuery(
						"select user.username , roles.role  from lda.users_roles  "
								+ "inner join lda.user on user.id =  users_roles.id "
								+ "inner join lda.roles on roles.role_id = users_roles.role_id where username =?");
    
		
    }
    
  
}