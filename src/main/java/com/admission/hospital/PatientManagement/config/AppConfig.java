package com.admission.hospital.PatientManagement.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
	
//	 @Bean
//	    public UserDetailsService userDetailsService() {
//	        UserDetails userDetails = User.buider().
//	                username("DURGESH")
//	                .password(passwordEncoder().encode("DURGESH")).roles("ADMIN").
//	                build();
////	        UserDetails userDetails=new User
//	        return new InMemoryUserDetailsManager(userDetails);
//	    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
	

}
