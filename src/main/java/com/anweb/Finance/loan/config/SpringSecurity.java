package com.anweb.Finance.loan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurity {

//	@Bean
//	public UserDetailsService userdetailsService() {
//		
//		UserDetails user=User.builder().username("ankit").password(passwordEncoder().encode("ankit")).roles("ADMIN").build();
//		UserDetails user1=User.builder().username("aniket").password(passwordEncoder().encode("aniket")).roles("ADMIN").build();
//		
//		return new InMemoryUserDetailsManager(user, user1);
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	 @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
	        return authenticationConfiguration.getAuthenticationManager();  // Authentication manager bean
	    }
	
}
