package com.valider.bouldergym;

import com.valider.bouldergym.config.EnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BouldergymApplication {

	public static void main(String[] args) {
		SpringApplication.run(BouldergymApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins(EnvConfig.devConfig)
						.allowCredentials(true)
						.allowedHeaders("Authorization")
						.allowedMethods("*")
						.maxAge(3600);
			}
		};
	}
}
