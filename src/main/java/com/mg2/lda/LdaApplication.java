package com.mg2.lda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.mg2.lda.storage.FileStorageProperties;


@EnableConfigurationProperties({ FileStorageProperties.class})
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdaApplication.class, args);
	}

}
